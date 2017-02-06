package ArrayIntro;

import java.util.Arrays;

/**
 * Created by zy on 2016/10/31.
 */
//模拟数组的扩容操作
public class ArrayUtils {

    public static <T> T[] expandCapacity(T[] datas,int newLen){
        newLen = newLen<0?datas.length:datas.length+newLen;

        //生成一个数组
        return Arrays.copyOf(datas,newLen);
    }

    //对数组进行扩容1.5倍
    public static <T> T[] expandCapacity(T[] datas){
        //将长度扩容1.5倍
        int newLen = (datas.length * 3)/2;
        return Arrays.copyOf(datas,newLen);
    }

    //对数组进行扩容
    /*public static <T> T[] expandCapacity(T[] datas,int multiple){
        multiple = multiple<0?1:multiple;
        int newLen = datas.length*multiple;
        return Arrays.copyOf(datas,newLen);
    }*/
}
