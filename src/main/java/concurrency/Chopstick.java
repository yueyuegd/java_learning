package concurrency;

/**
 * Created by zhangyue-k on 2017/5/7.
 * User:zhangyue-k
 * Date:2017/5/7
 */
//哲学家问题
public class Chopstick {
    private boolean taken = false;
    public synchronized void take() throws InterruptedException{
        while(taken){
            wait();

        }
        taken = true;
    }
    public synchronized void drop(){
        taken = false;
        notifyAll();
    }
}
