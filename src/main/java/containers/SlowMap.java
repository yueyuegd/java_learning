package containers;

import org.apache.commons.collections4.keyvalue.DefaultMapEntry;

import java.util.*;

/**
 * Created by zhangyue-k on 2017/3/12.
 * User:zhangyue-k
 * Date:2017/3/12
 */
/*  下面的实例使用一对ArrayLists实现了一个Map，这其中包含了Map接口的完整实现，因此提供了entrySet()方法*/
public class SlowMap<K,V> extends AbstractMap<K,V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();
    public V put(K key,V value){
        V oldValue = get(key);
        if(!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }else{
            values.set(keys.indexOf(key),value);
        }
        return oldValue;
    }

    public V get(Object key){
        if(!keys.contains(key)){
            return null;
        }else{
            return values.get(keys.indexOf(key));
        }
    }

    public Set<Map.Entry<K,V>> entrySet(){
        Set<Map.Entry<K,V>> set = new HashSet<Entry<K, V>>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while(ki.hasNext()){
            set.add(new DefaultMapEntry<K, V>(ki.next(),vi.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String,String> m = new SlowMap<String, String>();
        m.putAll(Countries.capitals(15));
        System.out.println(m);
        System.out.println(m.get("BULGARIA"));
        System.out.println(m.entrySet());
    }
}
