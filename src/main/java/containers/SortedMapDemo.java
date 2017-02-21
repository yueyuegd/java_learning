package containers;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * Created by zhangyue-k on 2017/2/21.
 */

//
public class SortedMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer, String> sortedMap = new TreeMap<Integer, String>(new CountingMapData(10));

        System.out.println(sortedMap);

        Integer low = sortedMap.firstKey();
        Integer high = sortedMap.lastKey();
        System.out.println(low);
        System.out.println(high);

        Iterator<Integer> it = sortedMap.keySet().iterator();
        for (int i = 0;i <= 6;i++){
            if (i == 3){
                low = it.next();
            }
            if (i == 6){
                high = it.next();
            } else{
                it.next();
            }
        }

        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedMap.subMap(low, high));
        System.out.println(sortedMap.headMap(high));
        System.out.println(sortedMap.tailMap(low));

    }


}
