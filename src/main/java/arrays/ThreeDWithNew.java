package arrays;

import java.util.Arrays;

/**
 * Created by zhangyue_k on 2016/12/11.
 */
//使用new表达式来分配三维数组
public class ThreeDWithNew {
    public static void main(String[] args) {
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
    }
}
