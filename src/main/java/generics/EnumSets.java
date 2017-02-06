package generics;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//修改Sets类使其可以接受EnumSet并使用clone方法来创建一个新的HashSet对象
public class EnumSets {

    //使用EnumSet中的clone方法
    public static <T> Set<T> copy(Set<T> sets){
        if(sets instanceof EnumSet){
            return ((EnumSet) sets).clone();
        }
        return new HashSet<T>();
    }

    //取并集
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> result = copy(a);
        result.addAll(b);
        return result;
    }
    //取交集
    public static <T> Set<T> intersection(Set<T> a,Set<T> b){
        Set<T> result = copy(a);
        result.retainAll(b);
        return result;
    }
    //取差集
    public static <T> Set<T> difference(Set<T> superSet,Set<T> subSet){
        Set<T> result = copy(superSet);
        result.removeAll(subSet);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a,Set<T> b){
        return difference(union(a,b),intersection(a,b));
    }
}
