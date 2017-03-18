package io;

import java.io.*;

/**
 * Created by zhangyue-k on 2017/3/18.
 * User:zhangyue-k
 * Date:2017/3/18
 */
/*  下面的实例演示了怎么一次一个字节的读取文件*/
public class TestEOF {
    public static void main(String[] args) throws IOException{


        try{

            DataInputStream in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\TestEOF.java")
                    )
            );

            while(in.available() != 0){
                System.out.print((char)in.readByte());
            }

        }catch (EOFException e){
            System.out.println("End of File");
        }

    }

}
