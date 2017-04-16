package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangyue-k on 2017/4/16.
 * User:zhangyue-k
 * Date:2017/4/16
 */
//将异常发生的部分放到try-catch中是没有作用的
public class NaiveExceptionHandle {

    public static void main(String[] args) {
        try{
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        }catch (RuntimeException ue){
            System.out.println("Exception has been handled");

        }
    }
}
