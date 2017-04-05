package io;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
import java.util.Random;

/**
 * Created by zhangyue-k on 2017/3/28.
 * User:zhangyue-k
 * Date:2017/3/28
 */
//下面的例子通过对链接的对象生成一个Warm对序列化机制进行了测试

class Data implements Serializable{
    private int n;

    public Data(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return Integer.toString(n);
    }
}
public class Worm implements Serializable{
    private static Random random = new Random(47);
    private Data[] d = {new Data(random.nextInt(10)),new Data(random.nextInt(10)),new Data(random.nextInt(10)),new Data(random.nextInt(10))};
    private Worm next;
    private char c;

    public Worm(int i,char x) {
        System.out.println("Worm constructor:" + i);
        c = x;
        if(--i > 0){
            next = new Worm(i,(char)(x + i));
        }

    }

    public Worm() {
        System.out.println("Default constructor");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(":");
        result.append(c);
        result.append("(");
        for(Data dat:d){
            result.append(dat);
        }
        result.append(")");
        if(next != null){
            result.append(next);
        }
        return result.toString();
    }

    public static void main(String[] args) throws ClassNotFoundException,IOException{
        Worm w = new Worm(6,'a');
        System.out.println("w=" + w);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\worm.out")
        );
        out.writeObject("Worm storage\n");
        out.writeObject(w);
        out.close();


        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\worm.out")
        );
        String s = (String)in.readObject();
        Worm w2 = (Worm) in.readObject();
        System.out.println(s + "w2=" +w2);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out2 = new ObjectOutputStream(bout);
        out2.writeObject("Wor, storage\n");
        out2.writeObject(w);
        out2.flush();
        ObjectInputStream in2 = new ObjectInputStream(
                new ByteArrayInputStream(bout.toByteArray())
        );
        s = (String) in2.readObject();
        Worm w3 = (Worm) in2.readObject();
        System.out.println(s + "w3=" + w3);

    }
}
