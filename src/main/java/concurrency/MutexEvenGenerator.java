package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhangyue-k on 2017/5/1.
 * User:zhangyue-k
 * Date:2017/5/1
 */
//LOCK显式地互斥机制
public class MutexEvenGenerator extends IntGenerator{
    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try{
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        }finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());
    }
}
