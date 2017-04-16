package concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//Runnable是执行工作的独立任务，但是他不返回任何值，如果你希望任务在执行完成时能够返回
//一个值，那么可以使用Callabel接口来替代Runnable接口，Callabel是一个具有类型参数的泛型，他的类型参数表示的是从
//方法call()中返回的值，并且必须使用ExecutorService.submit()来调用他

    class TaskWithResult implements Callable<String>{
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}
public class CallabelDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for(int i = 0; i < 10; i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for(Future<String> fs:results){
            try{
                System.out.println(fs.get());
            }catch (InterruptedException e){
                System.out.println(e);
                return;

            }catch (ExecutionException e){
                System.out.println(e);
                return;
            }finally {
                exec.shutdown();
            }
        }
    }


}
