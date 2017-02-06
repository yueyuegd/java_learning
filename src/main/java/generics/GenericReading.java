package generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//协变性和通配符的复习程序
public class GenericReading {
    static <T> T readExact(List<T> list){
        return list.get(0);
    }
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruits = Arrays.asList(new Fruit());

    static void f1(){
        Apple a = readExact(apples);
        System.out.println(a);
        Fruit f = readExact(fruits);
        System.out.println(f);
        f = readExact(apples);
        System.out.println(f);

    }

    static class Reader<T>{
        T readExact(List<T> list){
            return list.get(0);
        }
    }
    static void f2(){
        Reader<Fruit> fruitReader = new Reader<Fruit>();
        Fruit f = fruitReader.readExact(fruits);
        System.out.println(f);
    }
    static class CovariantReader<T>{
        T readCovariant(List<? extends T> list){
            return list.get(0);
        }
    }

    static void f3(){
        CovariantReader<Fruit> covariantReader = new CovariantReader<Fruit>();
        Fruit f = covariantReader.readCovariant(fruits);
        Fruit a = covariantReader.readCovariant(apples);
        System.out.println(f);
        System.out.println(a);
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }
}
