package concurrency;

/**
 * Created by zhangyue-k on 2017/4/16.
 * User:zhangyue-k
 * Date:2017/4/16
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){
        canceled = true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}
