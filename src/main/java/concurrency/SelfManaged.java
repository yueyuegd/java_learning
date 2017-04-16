package concurrency;

/**
 * Created by zhangyue-k on 2017/4/16.
 * User:zhangyue-k
 * Date:2017/4/16
 */
//还有一种惯用法就是自管理的Runnable
    //注意:start()方法是在构造器中调用的，可能会变得有问题，因为当另一个任务可能会在构造器结束之前开始执行，这意味着该任务能够访问处于不稳定状态的对象，
    //这是优选Executor而不是显式地创建Thread对象的另一个原因
public class SelfManaged implements Runnable{
    private int countDown = 5;
    private Thread t = new Thread(this);

    public SelfManaged() {
        t.start();
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName() + "(" + countDown + "),";
    }

    public void run() {
        while(true){
            System.out.print(this);
            if(--countDown == 0){
                return;
            }
        }

    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            new SelfManaged();
        }
    }
}
