package ArrayIntro;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zy on 2016/10/31.
 */
//使用Arrays.asList()方法将数组转化为集合时会出现一些问题
public class ArrayToList {

    public static void main(String[] args) {
        int[] arrays = new int[]{1,2,3,4,5};
        List list = Arrays.asList(arrays);
        System.out.println(list);
        System.out.println(list.size());//output:1
    }
}
