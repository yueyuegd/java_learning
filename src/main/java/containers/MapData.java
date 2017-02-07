package containers;

import generics.Generator;
import net.maindview.util.Pair;

import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * Created by zhangyue-k on 2017/2/6.
 */
public class MapData<K,V> extends LinkedHashMap<K,V> {

    //单个的Pair生成器
    public MapData(Generator<Pair<K,V>> gen,int quantity) {
        for(int i = 0;i < quantity;i++){
            Pair<K,V> p = gen.next();
            this.put(p.key,p.value);
        }
    }


    //两个单独的生成器
    public MapData(Generator<K> genK,Generator<V> genV,int quantity){
        for(int i = 0;i < quantity;i++){
            this.put(genK.next(),genV.next());
        }
    }

    //给定一个key的生成器和同一个value值
    public MapData(Generator<K> genK,V value,int quantity){
        for(int i = 0;i < quantity;i++){
            this.put(genK.next(),value);
        }
    }


    //给定一个遍历器和一个生成器
    public MapData(Iterable<K> genK,Generator<V> genV){
        for(K key:genK){
            this.put(key,genV.next());
        }
    }

    //给定一个遍历器和同一个值
    public MapData(Iterable<K> genK,V value){
        for(K key:genK){
            this.put(key,value);
        }
    }

    //上述都是使用构造器实现的，下面使用方法来实现 被称为泛型便利方法
    public static <K,V> MapData<K,V> map(Generator<Pair<K,V>> gen,int quantity){
        return new MapData<K, V>(gen,quantity);

    }

    public static <K,V> MapData<K,V> map(Generator<K> genK,Generator<V> genV,int quantity){
        return new MapData<K, V>(genK,genV,quantity);
    }

    public static <K,V> MapData<K,V> map(Generator<K> genK,V value,int quantity){
        return new MapData<K, V>(genK,value,quantity);
    }

    public static <K,V> MapData<K,V> map(Iterable<K> genK,Generator<V> genV){
        return new MapData<K, V>(genK,genV);
    }

    public static <K,V> MapData<K,V> map(Iterable<K> genK,V value){
        return new MapData<K, V>(genK,value);
    }
}
