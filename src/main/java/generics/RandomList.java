package generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
//需要一个持有特定类型对象的列表，每次调用其上的select()方法时，可以随机的选取一个元素
public class RandomList<T> {
    private ArrayList<T> list = new ArrayList<T>();
    private Random rand = new Random();
    public void add(T item){
        list.add(item);
    }
    public T select(){
        return list.get(rand.nextInt(list.size()));
    }

    public static void main(String[] args) {
        /*RandomList<String> randomList = new RandomList<String>();
        for(String s:"The quick brown fox jumped over the lazy brown dog".split(" ")){
            randomList.add(s);
        }
        for(int i=0;i<11;i++){
            System.out.print(randomList.select()+" ");
        }*/
        RandomList<Integer> randomListInt=new RandomList<Integer>();
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,0};
        for(int i=0;i<10;i++){
            randomListInt.add(intArray[i]);
        }
        for(int i=0;i<10;i++){
            System.out.print(randomListInt.select()+" ");
        }
        System.out.println();
        RandomList<Double> randomListDouble=new RandomList<Double>();
        double[] doubleArray = new double[]{1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        for(int i=0;i<9;i++){
            randomListDouble.add(doubleArray[i]);
        }
        for(int i=0;i<9;i++){
            System.out.print(randomListDouble.select()+" ");
        }
    }
}
