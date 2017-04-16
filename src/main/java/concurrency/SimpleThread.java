package concurrency;

/**
 * Created by zhangyue-k on 2017/4/16.
 * User:zhangyue-k
 * Date:2017/4/16
 */
//在非常简单的情况下，可以通过使用直接从Thread继承这种可替代方式来实现线程
public class SimpleThread extends Thread{
    private int countDown = 5;
    private static int threadCount = 0;

    public SimpleThread() {
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + countDown + "),";
    }

    public void run(){
        while(true){
            System.out.println(this);
            if(--threadCount == 0){
                return;
            }
        }

    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            new SimpleThread();
        }
    }
}
