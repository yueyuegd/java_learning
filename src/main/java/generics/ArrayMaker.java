package generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//泛型可以表示任何没有意义的事物
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }
    @SuppressWarnings("unchecked")
    T[] create(int size){
        return (T[])Array.newInstance(kind,size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringArrayMaker = new ArrayMaker<String>(String.class);
        String[] stringArray = stringArrayMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }
}
