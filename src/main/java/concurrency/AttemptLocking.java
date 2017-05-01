package concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhangyue-k on 2017/5/1.
 * User:zhangyue-k
 * Date:2017/5/1
 */
//只有在解决特殊问题的时候，才使用显式的Lock对象
//例如在使用synchronized关键字不能尝试着获取锁并且最终获取锁会失败，或者是获取锁一段时间，然后
//放弃他，要实现这些必须使用concurrent类库
public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();
    public void untimed(){
        boolean captured = lock.tryLock();
        try{
            System.out.println("trylock():" + captured);
        }finally {
            if(captured){
                lock.unlock();
            }
        }
    }

    public void timed(){
        boolean captured = false;
        try{
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }

        try{
            System.out.println("trylock(2,TimeUnit.SECONDS):" + captured);
        }finally {
            if(captured){
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();
        al.timed();
        new Thread(){
            {setDaemon(true);}
            public void run(){
                al.lock.lock();
                System.out.println("acquired");
            }
        }.start();
        Thread.yield();
        al.untimed();
        al.timed();
    }
}
