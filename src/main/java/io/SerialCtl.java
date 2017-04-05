package io;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * Created by zhangyue-k on 2017/4/5.
 * User:zhangyue-k
 * Date:2017/4/5
 */
/*  如果不坚持使用接口Externalizable来对序列化进行控制的话，也可以使用接口Serializable
*   并添加名为writeObject()和readObject()
*   这样一旦对象被序列化挥着是反序列化还原的时候，就会自动地调用你所添加的这两个方法
*   但是方法签名是有一定的规则
*   private void writeObject(ObjectOutputStream stream) throws IOException
*   private void readObject(ObjectInputStream stream) throws IOException,ClassNotFoundException*/
public class SerialCtl implements Serializable{
    private String a;
    private transient String b;

    public SerialCtl(String aa,String bb) {
        a = "Not Transient: " + aa;
        b = "Transient: " + bb;
    }

    @Override
    public String toString() {
        return a + "\n" + b;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException{
        stream.defaultWriteObject();
        stream.writeObject(b);
    }

    private void readObject(ObjectInputStream stream) throws IOException,ClassNotFoundException{
        stream.defaultReadObject();
        b = (String) stream.readObject();
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException{
        SerialCtl sc = new SerialCtl("Test1","Test2");
        System.out.println("Before:\n" + sc);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(buf);
        o.writeObject(sc);
        ObjectInputStream in = new ObjectInputStream(
                new ByteArrayInputStream(buf.toByteArray())
        );
        SerialCtl sc2 = (SerialCtl) in.readObject();
        System.out.println("After:\n" + sc2);
    }
}
