package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//所谓后台线程就是在程序运行的时候后台提供的一种通用服务的线程，
// 并且这种线程并不属于程序中不可或缺的部分，当所有的非后台线程结束时，
// 程序也就终止了，同时会杀死进程中的所有后台线程，也就是说，
// 只要有任何非后台线程还在运行程序就不会终止
public class SimpleDaemons implements Runnable{

    public void run() {
        try{
            while(true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e){
            System.out.println("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws Exception{
        for(int i = 0; i < 10; i++){
            Thread daemen = new Thread(new SimpleDaemons());
            daemen.setDaemon(true);
            daemen.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
