package codeblock;

/**
 * Created by zy on 2016/10/28.
 */
//静态代码块,构造代码块,构造方法之间的执行顺序
//静态代码块>构造代码块>构造方法
public class test1 {

    //静态代码块
    static{
        System.out.println("执行静态代码块.....");
    }

    //构造代码块
    {
        System.out.println("执行构造代码块.....");
    }

    //无参构造方法
    public test1(){
        System.out.println("执行无参的构造代码块.....");
    }

    //有参的构造方法
    public test1(int id){
        System.out.println("执行有参的构造方法.....");
    }


    public static void main(String[] args) {
        System.out.println("---------");
        new test1();
        System.out.println("---------");
        new test1(99);
    }
}
