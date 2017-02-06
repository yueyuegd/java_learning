package codeblock;

/**
 * Created by zy on 2016/10/28.
 */
public class test {

    //构造代码块
    {
        System.out.println("执行构造代码块");
    }

    //无参的构造方法
    public test(){
        System.out.println("无参的构造方法");
    }

    //有参的构造方法
    public test(int id){
        System.out.println("有参的构造犯法");
    }

    public static void main(String[] args) {
        test testemp = new test();
        System.out.println("-------------");
        test testemp2 = new test(1);
    }

    //注:构造代码快不是在构造方法之前运行的，而是依托于构造方法执行的
}
