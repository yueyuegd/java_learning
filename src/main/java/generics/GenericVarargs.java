package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
//泛型方法和可变参数可以一起使用
public class GenericVarargs {

    public static <T> List<T> makeList(T... args){
        List<T> result = new ArrayList<T>();
        for(T item:args){
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> is = makeList("A");
        System.out.println(is);
        is = makeList("A","B","C");
        System.out.println(is);
        is = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(is);
    }
}
