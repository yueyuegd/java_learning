package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//想要在两个类型之间建立某种类型的向上转型关系，这是通配符所允许的
public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> fruits = new ArrayList<Apple>();
        //不允许加入任何类型
        //fruits.add(new Apple());
        //fruits.add(new Fruit());
        //fruits.add(new Orange());
        //允许但是没有意义
        fruits.add(null);
        //至少还有一个元素在容器中  就是刚才加入的null
        Fruit f = fruits.get(0);
        System.out.println(f);
    }
}
