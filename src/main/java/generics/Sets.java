package generics;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
//一个Set的使用工具
public class Sets {
    //取并集
    public static <T> Set<T> union(Set<T> a,Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }
    //取交集
    public static <T> Set<T> intersection(Set<T> a,Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }
    //取差集
    public static <T> Set<T> difference(Set<T> superSet,Set<T> subSet){
        Set<T> result = new HashSet<T>(superSet);
        result.removeAll(subSet);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a,Set<T> b){
        return difference(union(a,b),intersection(a,b));
    }
}
