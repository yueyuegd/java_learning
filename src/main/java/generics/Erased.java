package generics;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//擦除使得代码在运行期间无法得知确切的类型信息
public class Erased<T> {
    private final int SIZE = 100;
    public static void f(Object arg){
        //Error
        /*if(arg instanceof T){

        }*/
        //Error
        //不能使用new一个对象一部分是因为泛型的擦除另一部分是因为编译器无法确定T是否有默认的无参构造器
       // T var = new T();
        //Error
        //T[] array = new T[SIZE];
        //Error
        //T[] array =(T) new Object[SIZE];
    }
}
