package generics;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
//使之接受三个不同类型的参数
public class GenericMethodsThreearg {

    public <T> void f(T a,T b,T c){
        System.out.println("a:"+a.getClass().getName()+" b:"+b.getClass().getName()+" c:"+c.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethodsThreearg gmt = new GenericMethodsThreearg();
        gmt.f(1,1.2,"zy");
    }
}
