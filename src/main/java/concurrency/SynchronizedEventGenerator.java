package concurrency;

/**
 * Created by zhangyue-k on 2017/5/1.
 * User:zhangyue-k
 * Date:2017/5/1
 */
public class SynchronizedEventGenerator extends IntGenerator {

    private int currentEventValue = 0;
    @Override
    public synchronized int next() {
        ++currentEventValue;
        Thread.yield();
        ++currentEventValue;
        return currentEventValue;

    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEventGenerator());
    }
}
