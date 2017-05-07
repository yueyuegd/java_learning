package concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyue-k on 2017/5/3.
 * User:zhangyue-k
 * Date:2017/5/3
 */
//演示了使用Executor来展示基本的interrupt()用法
    class SleepBlocked implements Runnable{

    public void run() {

        try{
            TimeUnit.SECONDS.sleep(100);
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
        System.out.println("Exiting SleepBlocked.run()");
    }
}

class IOBlocked implements Runnable{
    private InputStream in;

    public IOBlocked(InputStream in) {
        this.in = in;
    }

    public void run() {

        try{
            System.out.println("Waiting for read():");
            in.read();
        }catch (IOException e){
            if(Thread.currentThread().isInterrupted()){
                System.out.println("Interrupted from blpcked I/O");
            }else{
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting IOBlocked.run()");
    }
}

class SynchronizedBlocked implements Runnable{

    public synchronized  void f(){
        while (true){
            Thread.yield();
        }
    }

    public SynchronizedBlocked() {
        new Thread(){
            public void run(){
                f();
            }
        }.start();
    }

    public void run() {

        System.out.println("Trying to call f()");
        f();
        System.out.println("Exiting SynchroniedBlocked.run()");
    }
}
public class Interrupting {
    private static ExecutorService executorService = Executors.newCachedThreadPool();
    static void test(Runnable r) throws InterruptedException{
        Future<?> f = executorService.submit(r);
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Interrupted " + r.getClass().getName());
        f.cancel(true);
        System.out.println("Interrupted sent to " + r.getClass().getName());

    }

    public static void main(String[] args) throws Exception{
        test(new SleepBlocked());
        test(new IOBlocked(System.in));
        test(new SynchronizedBlocked());
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Aborting with System.exit(0)");
        System.exit(0);
    }
}
