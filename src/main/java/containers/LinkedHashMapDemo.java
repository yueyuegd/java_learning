package containers;

import java.util.LinkedHashMap;

/**
 * Created by zhangyue-k on 2017/2/21.
 * User:zhangyue-k
 * Date:2017/2/21
 * 用来演示LinkedHashMap的两种特性
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap =
                new LinkedHashMap<Integer, String>(new CountingMapData(9));
        System.out.println(linkedHashMap);
        //构造器的三个参数分别表示容量  负载因子  排序模式:true表示访问模式  被访问过的元素被移到最后---最近最少使用排序模式
        linkedHashMap = new LinkedHashMap<Integer, String>(16,0.75f,true);
        linkedHashMap.putAll(new CountingMapData(9));
        System.out.println(linkedHashMap);
        for(int i = 0;i < 6;i++){
            System.out.print(linkedHashMap.get(i)+ " ");
        }
        System.out.println();
        System.out.println(linkedHashMap);
        System.out.println("key为0的时候value:" + linkedHashMap.get(0));
        System.out.println(linkedHashMap);

    }
}
