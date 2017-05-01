package containers;

import java.util.*;

/**
 * Created by zhangyue-k on 2017/3/15.
 * User:zhangyue-k
 * Date:2017/3/15
 */
/*  关键字synchronize是线程同步中的   Collections中有方法能够自动同步整个容器*/
public class Synchronization {

    public static void main(String[] args) {
        Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        Set<String> set = Collections.synchronizedSet(new HashSet<String>());
        Set<String> ss = Collections.synchronizedSet(new TreeSet<String>());
        Map<String,String> m = Collections.synchronizedMap(new HashMap<String, String>());
        Map<String,String> sm = Collections.synchronizedSortedMap(new TreeMap<String, String>());
    }
}
