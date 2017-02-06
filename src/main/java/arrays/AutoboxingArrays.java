package arrays;

import java.util.Arrays;

/**
 * Created by zhangyue_k on 2016/12/16.
 */
//自动包装机制对数组初始化也起作用
public class AutoboxingArrays {
    public static void main(String[] args) {
        Integer[][] a = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(a));
    }
}
