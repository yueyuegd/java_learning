package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
//使用类型参数:用尖括号括住,放在类名的后面,在使用这个类的时候用实际的类型来替换此类型参数
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
        Automobile a = h3.getA();


    }
}
