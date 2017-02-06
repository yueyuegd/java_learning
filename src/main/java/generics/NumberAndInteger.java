package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//证明Number和Integer具有协变性
//引入通配符
public class NumberAndInteger {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<Number>();
        numberList.add(1);
        System.out.println(numberList);
        //List<Number> IntegetList = new ArrayList<Integer>();
        List<? extends Number> numbers = new ArrayList<Integer>();
        //引入通配符  协变性不起作用  以下编译器报错
        //numbers.add(1);
    }
}
