package generics;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//使用Sets中的difference方法得出java.util中各种Collection和Map之间的差异
public class ContainerMethodDifferences {

     static Set<String> methodSet(Class<?> type){
         Set<String> result = new TreeSet<String>();
         for(Method m:type.getMethods()){
             result.add(m.getName());
         }
         System.out.println(result);
         return result;
     }

    static void interfaces(Class<?> type){
        System.out.print("Interfaces in "+type.getSimpleName()+": ");
        List<String> result = new ArrayList<String>();
        for(Class<?> c:type.getInterfaces()){
            result.add(c.getSimpleName());
        }
        System.out.println(result);
    }
    static Set<String> object = methodSet(Object.class);
    static{
        object.add("clone");
    }
    static void difference(Class<?> superSet,Class<?> subSet){
        System.out.print(superSet.getSimpleName()+" extends "+subSet.getSimpleName()+",adds: ");
        //得到superSet中的所有方法,subSet中所有的方法,并得到他们之间的差值
        Set<String> comp = Sets.difference(methodSet(superSet),methodSet(subSet));
        //删掉Object类的所有方法
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superSet);
    }

    public static void main(String[] args) {
        System.out.println("Collection:"+methodSet(Collection.class));
        interfaces(Collection.class);
        difference(Set.class,Collection.class);
        difference(HashSet.class,Collection.class);
        difference(TreeSet.class,Collection.class);
        difference(LinkedHashSet.class,Collection.class);
        difference(List.class,Collection.class);
        difference(ArrayList.class,Collection.class);
        difference(LinkedList.class,Collection.class);
        difference(Queue.class,Collection.class);
        difference(PriorityQueue.class,Collection.class);
        System.out.println("Map:"+methodSet(Map.class));
        difference(HashMap.class,Collection.class);
        difference(LinkedHashMap.class,Collection.class);
        difference(SortedMap.class,Collection.class);
        difference(TreeMap.class,Collection.class);
    }
}
