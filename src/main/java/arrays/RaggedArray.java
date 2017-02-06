package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by zhangyue_k on 2016/12/11.
 */
//数组中构成矩阵的每一个向量都可以具有任意的长度
public class RaggedArray {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[][][] randArray = new int[random.nextInt(7)][][];
        for (int i = 0;i < randArray.length; i++){
            randArray[i] = new int[random.nextInt(5)][];
            for (int j = 0;j < randArray[i].length; j++){
                randArray[i][j] = new int[random.nextInt(5)];
            }
        }
        System.out.println(Arrays.deepToString(randArray));
    }
}
