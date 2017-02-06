package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
public class genericWriting {
    static <T> void writeExact(List<T> list, T item){
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();
    static void f1(){
        writeExact(apples,new Apple());
        writeExact(fruits,new Apple());
    }
    static <T> void writeWithWildcard(List<? super T> list,T item){
        list.add(item);
    }
    static void f2(){
        writeWithWildcard(apples,new Apple());
        writeWithWildcard(apples,new Jonathan());
        writeWithWildcard(fruits,new Apple());
    }

    public static void main(String[] args) {
        try{
            f1();
        }catch(Exception e){
            System.out.println(e);
        }

        /*try{
            f2();
        }catch (Exception e){
            System.out.println(e);
        }*/
    }
}
