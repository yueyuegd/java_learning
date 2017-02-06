package generics;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
//使之接受两个参数化类型，一个非参数化的类型
public class GenericMethodsThreeArgDiff {

    public <T> void f(Integer a,T b,T c){
        System.out.println("a:"+a.getClass().getName()+"  b:"+b.getClass().getName()+"  c:"+c.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethodsThreeArgDiff gmtd = new GenericMethodsThreeArgDiff();
        gmtd.f(1,"zy",'k');
    }
}
