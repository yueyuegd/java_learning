package concurrency.waxomatic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyue-k on 2017/5/7.
 * User:zhangyue-k
 * Date:2017/5/7
 */
//一个简单的例子来演示wait()，notify().notifyAll()的使用
//WaxOMatic.java有两个过程:一个是将蜡涂到Car上，一个是抛光他，抛光任务在涂蜡任务完成之前是不能执行的
//而涂蜡任务在涂另一层蜡之前必须等待抛光任务完成
class Car{
    private boolean waxOn = false;
    public synchronized void waxed(){
        waxOn = true;
        notifyAll();
    }
    public synchronized void buffer(){
        waxOn = false;
        notifyAll();
    }
    public synchronized void waitForWaxing() throws Exception{
        while(waxOn == false){
            wait();
        }
    }
    public synchronized void waitForBuffing() throws Exception{
        while (waxOn == true){
            wait();
        }
    }
}

class WaxOn implements Runnable{
    private Car car;

    public WaxOn(Car car) {
        this.car = car;
    }
    public void run(){
        try{
         while(!Thread.interrupted()){
             System.out.println("Wax On!");
             TimeUnit.MILLISECONDS.sleep(200);
             car.waxed();
             car.waitForBuffing();
         }
        }catch (Exception e){
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending Wax On task");
    }
}

class WaxOff implements Runnable{
    private Car car;

    public WaxOff(Car car) {
        this.car = car;
    }
    public void run(){
        try{
            while (!Thread.interrupted()){
               car.waitForWaxing();
                System.out.println("Wax Off!");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffer();
            }
        }catch (Exception e){
            System.out.println("Exiting vai interrupt");
        }
        System.out.println("Ending Wax Off task");
    }
}
public class WaxOMatic {
    public static void main(String[] args) throws Exception{
        Car car = new Car();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOff(car));
        exec.execute(new WaxOn(car));
        TimeUnit.SECONDS.sleep(5);
        exec.shutdownNow();
    }
}
