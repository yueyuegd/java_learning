package ArrayIntro;

/**
 * Created by zy on 2016/10/31.
 */
//对于数组的测试
//数组是Object的直接子类
public class Test {

    public static void main(String[] args) {
        int[] arrays = new int[10];
        System.out.println("arrays的父类是:"+arrays.getClass().getSuperclass());
        System.out.println("arrays的类名是:"+arrays.getClass().getName());
    }
}
