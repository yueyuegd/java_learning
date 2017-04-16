package concurrency;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//线程需要定义任务，由Runnable接口来提供，并编写run方法，例如下面的类就是用来显示发射之前的倒计时
public class LiftOff implements Runnable{
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0?countDown:"LiftOff!") + "),";
    }

    public void run() {

        while(countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
