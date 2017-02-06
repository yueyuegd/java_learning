package generics;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//编译器将直接拒绝对参数列表中涉及通配符的方法的调用
//为了在类型中适应了通配符的情况下禁止这类调用  需要在参数列表中使用类型参数
public class Holder<T> {
    private T value;

    public Holder(T value) {
        this.value = value;
    }

    public Holder() {
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public boolean equals(Object obj){
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<Apple>(new Apple());
        Apple a = appleHolder.getValue();
        appleHolder.setValue(a);
        Holder<? extends Fruit> fruitHolder = appleHolder;
        Fruit f = fruitHolder.getValue();
        a = (Apple) fruitHolder.getValue();
        try{
            Orange orange =(Orange) fruitHolder.getValue();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
