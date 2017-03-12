package containers;

import java.util.Map;

/**
 * Created by zhangyue-k on 2017/3/12.
 * User:zhangyue-k
 * Date:2017/3/12
 */
/*  Map.entrySet()方法必须产生一个Map.Entry对象集，但是Map.Entry是一个接口，
用来描述依赖于实现的结构，因此如果你想要创建自己的Map类型就必须同时定义Map.Entry的实现*/
public class MapEntry<K,V> implements Map.Entry<K,V> {

    private K key;
    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public V setValue(V v){
        V result = value;
        value = v;
        return result;
    }
    public int hashCode(){
        return (key == null? 0 : key.hashCode()) ^ (value == null? 0 : value.hashCode());
    }
    public boolean equals(Object o){
        if(!(o instanceof MapEntry)) return false;
        MapEntry me = (MapEntry)o;
        return (key == null? me.getKey() == null:key.equals(me.getKey())) &&
                (value == null?me.getValue()==null:value.equals(me.getValue()));
    }
    public String toString(){
        return key + "=" + value;
    }
}
