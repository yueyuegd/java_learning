package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyue-k on 2017/4/16.
 * User:zhangyue-k
 * Date:2017/4/16
 */
//后台进程正在不执行finally子句的情况下就会终止其run()方法
    class ADaemon implements Runnable{

    public void run() {
        try{
            System.out.println("Starting ADaemon");
            TimeUnit.MILLISECONDS.sleep(1);
        }catch(InterruptedException e){
            System.out.println("Exiting via InterruptedException");
        }finally{
            System.out.println("This should always run?");
        }
    }
}
public class DaemonsDontRunFinally {
    public static void main(String[] args) {
        Thread t = new Thread(new ADaemon());
        //t.setDaemon(true);
        t.start();
    }
}
