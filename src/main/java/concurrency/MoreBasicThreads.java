package concurrency;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//下面可以看到所有任务彼此之间是如何相互呼应的
public class MoreBasicThreads {
    public static void main(String[] args) {
        for(int i = 0;i < 5; i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
