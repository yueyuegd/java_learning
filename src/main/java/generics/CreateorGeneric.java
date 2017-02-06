package generics;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//模板方法设计模式

abstract class GenericWithCreate<T>{
    final T element;

    GenericWithCreate() {
        element=create();
    }
    abstract T create();
}
class X{}
class Creator extends GenericWithCreate<X>{
    X create(){
        return new X();
    }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }

}
public class CreateorGeneric {

    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}
