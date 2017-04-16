package concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by zhangyue-k on 2017/4/16.
 * User:zhangyue-k
 * Date:2017/4/16
 */
//定制一个ThreadFactory可以定制由Executor创建的线程的属性(后台，优先级，名称)
public class DaemonThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
