package concurrency;

/**
 * Created by zhangyue-k on 2017/4/16.
 * User:zhangyue-k
 * Date:2017/4/16
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;

    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
