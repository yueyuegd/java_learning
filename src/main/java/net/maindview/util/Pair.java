package net.maindview.util;

/**
 * Created by zhangyue-k on 2017/2/6.
 */
//用于Map生成器的一个对象对实体
public class Pair<K,V> {

    //private final K key;
    //private final V value;
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
