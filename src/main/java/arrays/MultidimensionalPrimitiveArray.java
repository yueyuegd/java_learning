package arrays;

import java.util.Arrays;

/**
 * Created by zhangyue_k on 2016/12/11.
 */
//多维数组  对于基本类型的多维数组使用花括号将每个分量分隔开
public class MultidimensionalPrimitiveArray {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},{4, 5, 6}
        };
        System.out.println(Arrays.deepToString(a));
    }

}
