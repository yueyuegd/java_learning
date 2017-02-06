package generics;

import coffee.Coffee;

import java.util.*;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
        for(int i=0;i<n;i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> list,Generator<T> gen,int n){
        for(int i=0;i<n;i++){
            list.add(gen.next());
        }
        return list;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> linkedList,Generator<T> gen,int n){
        for(int i=0;i<n;i++){
            linkedList.add(gen.next());
        }
        return linkedList;
    }

    public static <K,V> Map<K,V> fill(Map<K,V> map,Generator<V> gen,int n){
        for(int i=0;i<n;i++){
            map.put(null,gen.next());
        }
        return map;
    }

    public static <T> Set<T> fill(Set<T> set,Generator<T> gen,int n){
        for(int i=0;i<n;i++){
            set.add(gen.next());
        }
        return set;
    }

    public static void main(String[] args) {
        /*Collection<Coffee> coffee = fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
        for(Coffee coffee1:coffee){
            System.out.println(coffee1);
        }
        Collection<Integer> integers = fill(new ArrayList<Integer>(),new Fibonacci(),12);
        for(int i:integers){
            System.out.print(i+",");
        }*/

        //测试具体类型
        LinkedList<Coffee> list = fill(new LinkedList<Coffee>(),new CoffeeGenerator(),4);
        for(Coffee c:list){
            System.out.println(c);
        }

       /* Set<Coffee> set = fill(new HashSet<Coffee>(),new CoffeeGenerator(),4);
        for(Coffee c:set){
            System.out.println(c);
        }*/

       /* Map<Integer,Coffee> map = fill(new HashMap<Integer,Coffee>(),new CoffeeGenerator(),2);
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry);
        }*/
    }
}
