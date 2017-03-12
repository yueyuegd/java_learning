package containers;

import java.util.*;

/**
 * Created by zhangyue-k on 2017/3/12.
 * User:zhangyue-k
 * Date:2017/3/12
 */
/*  利用散列原理创建一个简单的散列Map*/
public class SimpleHashMap<K,V> extends AbstractMap<K,V> {

    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K,V>>[] buckets = new LinkedList[SIZE];
    public V put(K key,V value){
        V oldVlaue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null){
            buckets[index] = new LinkedList<MapEntry<K, V>>();

        }
        LinkedList<MapEntry<K,V>> bucket = buckets[index];
        MapEntry<K,V> pair = new MapEntry<K, V>(key,value);
        boolean found = false;
        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
        while(it.hasNext()){
            MapEntry<K,V> iPair = it.next();
            if(iPair.getKey().equals(key)){
                oldVlaue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if(!found){
            buckets[index].add(pair);
        }
        return oldVlaue;
    }

    public V get(Object key){
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null){
            return null;
        }
        for(MapEntry<K,V> iPair:buckets[index]){
            if(iPair.getKey().equals(key)){
                return iPair.getValue();
            }
        }
        return null;
    }

    public Set<Map.Entry<K,V>> entrySet(){
        Set<Map.Entry<K,V>> set = new HashSet<Entry<K, V>>();
        for(LinkedList<MapEntry<K,V>> bucket:buckets){
            if(bucket == null){
                continue;
            }
            for(MapEntry<K,V> mPair:bucket){
                set.add(mPair);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        SimpleHashMap<String,String> m = new SimpleHashMap<String, String>();
        m.putAll(Countries.capitals(25));
        System.out.println(m);
        System.out.println(m.get("ERITREA"));
        System.out.println(m.entrySet());
    }


}
