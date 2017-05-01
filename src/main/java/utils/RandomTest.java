package utils;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//用来测试工具类Enums的一个方法

    enum Activity{
    SITTING,LYING,HOPPING,RUNNING,DODGING,JUMPING,FALLING,FLYING
}
public class RandomTest {

    public static void main(String[] args) {
        for(int i = 0 ;i < 20; i++){
            System.out.println(Enums.random(Activity.class) + " ");
        }
    }

}
