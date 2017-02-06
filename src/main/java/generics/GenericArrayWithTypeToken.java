package generics;

import java.lang.reflect.Array;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//传递一个类型标记
public class GenericArrayWithTypeToken<T> {
    private T[] array;
    @SuppressWarnings("unchecked")

    public GenericArrayWithTypeToken(Class<T> type,int sz) {
        array= (T[])Array.newInstance(type,sz);
    }
    public void put(int index,T item){
        array[index] = item;
    }
    public T get(int index){
        return array[index];
    }
    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai =
                new GenericArrayWithTypeToken<Integer>(Integer.class,10);
        Integer[] arrays = gai.rep();
    }
}
