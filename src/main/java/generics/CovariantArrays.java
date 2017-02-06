package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//向导出类型的素组赋予基类型的数组引用
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}
public class CovariantArrays {
    public static void main(String[] args) {
        //运行期间是Apple[]类型而不是Fruit[]或者是Orange[]类型
        Fruit[] fruits = new Apple[10];
        //可以
        fruits[0] = new Apple();
        //可以
        fruits[1] = new Jonathan();
        //使用泛型  使之在编译器发现错误
//        List<Fruit> list = new ArrayList<Apple>();
        try{
            //运行期间异常  ArrayStoreException   编译器是可以的
            fruits[0] = new Orange();
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            fruits[0] = new Fruit();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
