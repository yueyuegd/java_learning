package letecode;

/**
 * Created by zhangyue-k on 2017/3/18.
 * User:zhangyue-k
 * Date:2017/3/18
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] targets = new int[2];
        int index = 0;
        //两个for循环
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if(nums[i] + nums[j] == target && i != j){

                    if(i >= j){
                        index = 0;
                        targets[index] = j;
                        targets[++index] = i;
                    }else{
                        index = 0;
                        targets[index] = i;
                        targets[++index] = j;
                    }


                }
            }
        }
        return targets;

    }

    public static void main(String[] args){
        int[] arraySrc = new int[4];
        arraySrc[0] = 2;
        arraySrc[1] = 7;
        arraySrc[2] = 11;
        arraySrc[3] = 15;
        int[] targets = twoSum(arraySrc,9);
        for(int i = 0;i < targets.length;i++){
            System.out.println(targets[i]);
        }
    }
}
