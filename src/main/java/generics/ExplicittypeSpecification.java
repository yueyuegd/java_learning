package generics;

import ArrayIntro.Person;
import utils.New;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
//解决类型判断的问题   显示的指明类型
public class ExpliciTtypeSpecification {

    public static void f(Map<Person,List<Pet>> petPerson){
        //在点操作符和方法名之间加上具体的类型
        f(New.<Person, List<Pet>>map());
    }
}
