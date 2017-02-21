package containers;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhangyue-k on 2017/2/21.
 */

//以下展示了通过Map接口可用的操作
//Ex17_14_3  说明java.util.Properties在下面的程序中可以工作
public class Maps {

    public static void printKeys(Map<Integer, String> map){
        System.out.print("Size = "+ map.size()+ ",");
        System.out.print("Keys:");
        System.out.print(map.keySet());
    }

    public static void test(Map<Integer, String> map){
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        map.putAll(new CountingMapData(25));
        printKeys(map);
        System.out.print("Values:");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11):"+ map.containsKey(11));
        System.out.println("map.get(11):"+ map.get(11));
        System.out.println("map.containsValue(\"F0\"):" +map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        System.out.println("First key in map:"+ key);
        map.remove(key);
        printKeys(map);
        map.clear();
        System.out.println("map.isEmpty():"+ map.isEmpty());
        map.putAll(new CountingMapData(25));
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty():"+ map.isEmpty());
    }

    public static void main(String[] args) {
        test(new HashMap<Integer, String>());
        test(new TreeMap<Integer, String>());
        test(new LinkedHashMap<Integer, String>());
        test(new IdentityHashMap<Integer, String>());
        test(new ConcurrentHashMap<Integer, String>());
        test(new WeakHashMap<Integer, String>());

    }
}
