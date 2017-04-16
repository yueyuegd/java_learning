package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyue-k on 2017/4/16.
 * User:zhangyue-k
 * Date:2017/4/16
 */
//可以通过调用isDaemon()方法来确定线程是否是一个后台线程，
// 如果是一个后台线程那么他创建的任何线程将被自动设置为后台线程
class Daemon implements Runnable{
    private Thread[] t = new Thread[10];


    public void run() {
        for(int i = 0; i < t.length; i++){
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            System.out.print("DaemonSpawn " + i + "started,");
        }
        for(int i = 0; i < t.length; i++){
            System.out.print("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
        }
        while(true){
            Thread.yield();
        }
    }
}

class DaemonSpawn implements Runnable{

    public void run() {
        while(true){
            Thread.yield();
        }
    }
}
public class Daemons {

    public static void main(String[] args) throws Exception{
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.print("d.isDaemon = " + d.isDaemon() + ",");
        TimeUnit.MILLISECONDS.sleep(1);
    }
}
