package io;

import java.io.*;

/**
 * Created by zhangyue-k on 2017/4/5.
 * User:zhangyue-k
 * Date:2017/4/5
 */
/* 以下的例子说明了如何完整保存和恢复一个Externalizable对象*/
    /*  实现Externalizable接口的时候，当要恢复对象的时候先是调用默认的构造函数在调用方法readExternal()*/
public class Blip3 implements Externalizable{
    private int i;
    private String s;

    public Blip3() {
        System.out.println("Blip3 Constructor");
    }

    public Blip3(String x,int a) {
        System.out.println("Blip3(String x,int a)");
        s = x;
        i =a;
    }
    public String toString(){
        return s + i;
    }

    public void writeExternal(ObjectOutput out) throws IOException{
        System.out.println("Blip3.writeExternal");
        out.writeObject(s);
        out.writeObject(i);
    }

    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
        System.out.println("Blip3.readExternal");
        s = (String)in.readObject();
        i = (Integer) in.readObject();

    }

    public static void main(String[] args) throws IOException,ClassNotFoundException{
        System.out.println("Constructor objects:");
        Blip3 b3 = new Blip3("A String",47);
        System.out.println(b3);

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Blip3.out")
        );

        System.out.println("Saving Object:");
        out.writeObject(b3);
        out.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Blip3.out")
        );
        System.out.println("Recovering b3:");
        b3 = (Blip3) in.readObject();
        System.out.println(b3);

    }
}
