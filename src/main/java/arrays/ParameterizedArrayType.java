package arrays;

import java.util.Arrays;

/**
 * Created by zhangyue_k on 2016/12/16.
 */
class ClassParameter<T>{
    public T[] f(T[] arg){
        return arg;
    }
}
class MethodParameter{
    public static <T> T[] f(T[] arg){
        return arg;
    }
}
public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5};
        Double[] doubles = {1.1,2.2,3.3,4.4};
        Integer[] ints1 = new ClassParameter<Integer>().f(ints);
        System.out.println(Arrays.deepToString(ints));
        Double[] doubles1 = new ClassParameter<Double>().f(doubles);
        System.out.println(Arrays.deepToString(doubles));
        ints1 = MethodParameter.f(ints);
        System.out.println(Arrays.deepToString(ints1));
        doubles1 = MethodParameter.f(doubles);
        System.out.println(Arrays.deepToString(doubles1));
    }

}
