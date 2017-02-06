package generics;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
class ClassAsFactory<T>{
    T x;

    public ClassAsFactory(Class<T> kind) {
        try{
            x = kind.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
class Employee{}
public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> classAsFactory =
                new ClassAsFactory<Employee>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeed");
        try{
            //下面的会出错  因为Integer没有显式的默认无参构造方法
            ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
        }catch (Exception e){
            System.out.println("ClassAsFactory<Integer> failed");
        }

    }
}
