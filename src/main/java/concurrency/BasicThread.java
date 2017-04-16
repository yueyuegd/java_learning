package concurrency;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//下面显示了如何使用Thread来驱动LiftOff对象
    //将Runnable对象转化为工作任务的传统方式就是把它提交给一个Thread构造器
public class BasicThread {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");

    }
}
