package generics;

import java.util.ArrayList;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//创建一个ArrayList<String>或者是ArrayList<Integer>对象,通过getCLass()只能得到该对象是ArrayList类型的
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        System.out.println(c1);
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c2);
        System.out.println(c1==c2);
    }
}
