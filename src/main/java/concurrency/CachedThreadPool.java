package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//CachedThreadPool将为每一个任务创建一个线程
    //Executor将为你管理Thread对象
public class CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0;i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
