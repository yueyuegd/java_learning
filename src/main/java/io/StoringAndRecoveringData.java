package io;

import java.io.*;

/**
 * Created by zhangyue-k on 2017/3/18.
 * User:zhangyue-k
 * Date:2017/3/18
 */
/*  存储和恢复数据*/
/*  如果我们使用DataOutputStream写入数据，Java可以保证我们使用DataInputStream准确的读取数据
*   无论读和写数据的平台是多么的不同*/
public class StoringAndRecoveringData {

    public static void main(String[] args) throws IOException{

        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Data.txt")
                )
        );

        out.writeDouble(3.14159);
        out.writeUTF("That was pi");
        out.writeDouble(1.41459);
        out.writeUTF("Square root of 2");
        out.close();

        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Data.txt")
                )
        );

        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());

    }


}
