package containers;

/**
 * Created by zhangyue-k on 2017/3/12.
 * User:zhangyue-k
 * Date:2017/3/12
 */

/*  当你创建用作HashMap的键的类，有可能会忘记在其中放置必需的方法*/
/*  考虑一个天气预报系统，将Groundhog土拨鼠对象与Prediction(预报)对象联系起来*/
/*  看起来很简单，创建两个类，使用土拨鼠类作为键，预报作为值*/
public class Groundhog {

    protected int number;
    public Groundhog(int n){ number = n;}
    public String toString(){
        return "Groundhog #" + number;
    }

}
