package annotations;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//下面的类中有一个公共方法，我们将会把它抽取到一个有用的接口中
@ExtractInterface("IMultiplier")
public class Multiplier {

    public int multiplier(int x,int y){
        int total = 0;
        for(int i = 0;i < x; i++){
            total = add(total,y);
        }
        return total;
    }

    private int add(int x,int y){
        return x + y;
    }

    public static void main(String[] args) {
        Multiplier m = new Multiplier();
        System.out.println("11*16 = " + m.multiplier(11,16));
    }
}
