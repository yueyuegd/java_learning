package containers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by zhangyue-k on 2017/2/21.
 */

//修改AssociativeArray中的main方法，替代为使用HashMap，TreeMap，LinkedHashMap
public class Ex17_12_1 {

    public static void main(String[] args) {


        Map<String, String> hashMap = new HashMap<String, String>(4);

        hashMap.put("wangjunkai", "17");
        hashMap.put("yiyangqianxi", "16");
        hashMap.put("wangyuan", "16");
        hashMap.put("luhan", "27");

        System.out.println(hashMap);

        Map<String, String> treeMap = new TreeMap<String, String>();

        treeMap.put("wangjunkai", "17");
        treeMap.put("yiyangqianxi", "16");
        treeMap.put("wangyuan", "16");
        treeMap.put("luhan", "27");
        treeMap.put("wangjunkai", "17");
        treeMap.put("yiyangqianxi", "16");
        treeMap.put("wangyuan", "16");
        treeMap.put("luhan", "27");

        System.out.println(treeMap);

        Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();

        linkedHashMap.put("wangjunkai", "17");
        linkedHashMap.put("yiyangqianxi", "16");
        linkedHashMap.put("wangyuan", "16");
        linkedHashMap.put("luhan", "27");
        linkedHashMap.put("wangjunkai", "17");
        linkedHashMap.put("yiyangqianxi", "16");
        linkedHashMap.put("wangyuan", "16");
        linkedHashMap.put("luhan", "27");

        System.out.println(linkedHashMap);
    }
}
