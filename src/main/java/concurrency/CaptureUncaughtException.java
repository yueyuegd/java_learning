package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by zhangyue-k on 2017/4/16.
 * User:zhangyue-k
 * Date:2017/4/16
 */
//为了解决异常不能捕获的问题，要修改Executor产生线程的方式
    //Thread.UncaughtExceptionHandler是新的接口，他允许你在每一个Thread对象上附着一个异常处理器
    //Thread.UncaughtExceptionHandler.uncaughtException()会在线程因未捕获异常而临近死亡时被调用

class ExceptionThread2 implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by " + t);
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
class MyUncaughtExceptionHandle implements Thread.UncaughtExceptionHandler{

    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e);
    }
}
class HandlerThreadFactory implements ThreadFactory{

    public Thread newThread(Runnable r) {
        System.out.println(this + " Creating new Thread");
        Thread t = new Thread();
        System.out.println("created " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandle());
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        return t;
    }
}
public class CaptureUncaughtException {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
        exec.execute(new ExceptionThread2());
    }
}
