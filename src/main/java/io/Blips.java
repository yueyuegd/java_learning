package io;

import java.io.*;

/**
 * Created by zhangyue-k on 2017/4/5.
 * User:zhangyue-k
 * Date:2017/4/5
 */
/*  考虑到对象序列化的特殊情况，如不希望对象的某一部分不被序列化，或者是一个对象被还原以后，对于子对象需要重新创建
*   从而不需要将该子对象序列化。在一些特殊情况下可以通过实现Externalizable接口代替实现Serializable接口
*   来对序列化的过程进行控制*/

class Blip1 implements Externalizable{
    public Blip1() {
        System.out.println("Blip1 Constructor");
    }

    public void writeExternal(ObjectOutput out)throws IOException{
        System.out.println("Blip1.writeExternal");

    }

    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
        System.out.println("Blip1.readExternal");

    }
}

class Blip2 implements Externalizable{
    public Blip2() {
        System.out.println("Blip2 constructor");
    }

    public void writeExternal(ObjectOutput out)throws IOException{
        System.out.println("Blip2.writeExternal");

    }

    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
        System.out.println("Blip2.readExternal");

    }
}
public class Blips {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        System.out.println("Constructing objects:");
        Blip1 b1 = new Blip1();
        Blip2 b2 = new Blip2();

        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Blips.out")
        );
        System.out.println("Saving objects:");
        o.writeObject(b1);
        o.writeObject(b2);
        o.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Blips.out")
        );
        System.out.println("Recovering b1:");
        b1 = (Blip1) in.readObject();

    }
}
