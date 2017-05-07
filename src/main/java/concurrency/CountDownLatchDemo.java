package concurrency;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyue-k on 2017/5/7.
 * User:zhangyue-k
 * Date:2017/5/7
 */
//实例使用CountDownLatch
class TeskPortion implements Runnable{
    private static int counter = 0;
    private final int id = counter++;
    private static Random random = new Random(47);
    private final CountDownLatch latch;

    public TeskPortion(CountDownLatch latch) {
        this.latch = latch;
    }
    public void run(){
        try{
            doWork();
            latch.countDown();
        }catch (Exception e){

        }
    }
    public void doWork() throws Exception{
        TimeUnit.MILLISECONDS.sleep(random.nextInt(2000));
        System.out.println(this + "completed");
    }

    @Override
    public String toString() {
        return String.format("%1$-3d",id);
    }
}
class WaitingTask implements Runnable{
    private static int counter = 0;
    private final int id = counter++;
    private final CountDownLatch latch;

    public WaitingTask(CountDownLatch latch) {
        this.latch = latch;
    }
    public void run(){
        try{
            latch.await();
            System.out.println("Latch barrier passed for " + this);
        }catch (Exception e){
            System.out.println(this + "interrupted");
        }
    }
    public String toString(){
        return String.format("WaitingTask %1$-3d ",id);
    }
}
public class CountDownLatchDemo {
    static final int SIZE = 100;

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        CountDownLatch latch = new CountDownLatch(SIZE);
        for(int i = 0; i < 10; i++){
            exec.execute(new WaitingTask(latch));
        }
        for(int i = 0; i < SIZE; i++){
            exec.execute(new TeskPortion(latch));
        }
        System.out.println("Launched all tasks");
        exec.shutdown();
    }
}
