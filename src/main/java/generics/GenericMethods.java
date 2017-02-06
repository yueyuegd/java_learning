package generics;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
//泛型方法的定义  只需要将泛型参数列表置于方法返回值之前
public class GenericMethods {

    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
