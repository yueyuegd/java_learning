package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/9.
 */
//数组和容器的比较
class BerylliumSpere{
    private static long counter;
    private final long id=counter++;
    public String toString(){
        return "Sphere  "+id;
    }
}
public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSpere[] berylliumSperes =
                new BerylliumSpere[10];
        for(int i=0;i<5;i++){
            berylliumSperes[i] = new BerylliumSpere();
        }
        System.out.println(berylliumSperes.toString());
        System.out.println(berylliumSperes[4]);
        //容器
        List<BerylliumSpere> berylliumSpereList =
                new ArrayList<BerylliumSpere>();
        for(int i=0;i<5;i++){
            berylliumSpereList.add(new BerylliumSpere());
        }
        System.out.println(berylliumSpereList);
        System.out.println(berylliumSpereList.get(4));

        int[] integers = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);

        List<Integer> intList = new ArrayList<Integer>(
                Arrays.asList(0,1,2,3,4,5)
        );
        intList.add(97);
        System.out.println(intList);
        System.out.println(intList.get(4));
    }
}
