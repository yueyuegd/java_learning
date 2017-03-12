package containers;

/**
 * Created by zhangyue-k on 2017/3/12.
 * User:zhangyue-k
 * Date:2017/3/12
 */
/*  可以作为HashMap键的一个自己创建的类  必须要重载hashCode()和equals()*/
public class Groundhog2 extends Groundhog {

    public Groundhog2(int n) {
        super(n);
    }

    public int hashCode(){
        return number;
    }

    public boolean equals(Object o){
        return o instanceof Groundhog2 && (number == ((Groundhog2)o).number);
    }
}
