package ExceptionHandler;

/**
 * Created by zy on 2016/10/31.
 */
//自定义异常
//要经历四个步骤:1.定义一个类要继承于Throwable或其子类
//2.添加构造方法(也可以不用添加,就是用默认的构造方法)
//3.在某个方法中抛出该异常
//4.捕获该异常
public class MyException extends Exception{

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
