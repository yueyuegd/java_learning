package io;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyue-k on 2017/4/5.
 * User:zhangyue-k
 * Date:2017/4/5
 */
/*  如果我们操作的是一个实现了Serializable接口的对象，那么所有的序列化操作都会
*   自动进行，为了可以控制，可以通过使用关键字transient来逐个关闭序列化*/
/*  假设某个Login保存的是一个登陆信息，想要把数据保存起来但是不包括密码*/
public class Login implements Serializable{
    private Date date = new Date();
    private String username;
    private transient String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login info{" +
                "date=" + date +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception{
        Login login = new Login("Hulk","myLittlePony");
        System.out.println("login a = " + login);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\login.out")
        );
        out.writeObject(login);
        out.close();
        TimeUnit.SECONDS.sleep(1);

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\login.out")
        );
        System.out.println("recovering object at " + new Date());
        login = (Login) in.readObject();
        System.out.println("Login login = " + login);

    }
}
