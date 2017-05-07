package concurrency;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyue-k on 2017/5/7.
 * User:zhangyue-k
 * Date:2017/5/7
 */
//哲学家
public class Philosopher implements Runnable{
    private Chopstick left;
    private Chopstick right;
    private final int id;
    private final int ponderFactor;
    private Random random = new Random(47);
    private void pause() throws InterruptedException{
        if(ponderFactor == 0)
            return;
        TimeUnit.MILLISECONDS.sleep(random.nextInt(ponderFactor*250));
    }

    public Philosopher(int id, int ponderFactor, Chopstick left, Chopstick right) {
        this.id = id;
        this.ponderFactor = ponderFactor;
        this.left = left;
        this.right = right;
    }
    public void run(){
        try{
            while(!Thread.interrupted()){
                System.out.println(this + " " + "thinking");
                pause();
                System.out.println(this + " " + "grabbing right");
                right.take();
                System.out.println(this + " " + "grabbing left");
                left.take();
                System.out.println(this + " " + "eating");
                pause();
                right.drop();
                left.drop();
            }
        }catch (Exception e){
            System.out.println(this + " " + "exiting via interrupted");
        }
    }
}
