package generics;

import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//超类型通配符  可以声明通配符是由某个特定类的任何基类来界定的
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new Jonathan());
        //apples.add(new Fruit());  Error
    }
}
