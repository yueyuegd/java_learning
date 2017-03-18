package io;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by zhangyue-k on 2017/3/15.
 * User:zhangyue-k
 * Date:2017/3/15
 */
/*  下面是一个可以添加新行并缩排所有元素的工具*/
public class PPrnit {

    public static String pformat(Collection<?> c){
        if(c.size() == 0){
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        for(Object elem:c){
            if(c.size() != 1){
                result.append("\n ");
            }
            result.append(elem);
        }
        if(c.size() !=1){
            result.append("\n");
        }
        result.append("]");
        return result.toString();
    }

    public static void pprint(Collection<?> c){
        System.out.println(pformat(c));
    }
    public static void pprint(Object[] c){
        System.out.println(pformat(Arrays.asList(c)));
    }
}
