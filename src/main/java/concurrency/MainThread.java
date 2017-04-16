package concurrency;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//总是分配给main()的那个线程
public class MainThread {

    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
