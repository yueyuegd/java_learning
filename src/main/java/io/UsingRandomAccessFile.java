package io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by zhangyue-k on 2017/3/18.
 * User:zhangyue-k
 * Date:2017/3/18
 */
/*  使用RandomAccessFile来读取随机访问文件   在使用的时候必须知道文件的排版才能够正确的操作它
*   RandomAccessFile拥有读取基本数据类型和UTF-8字符串的各种具体方法*/
public class UsingRandomAccessFile {

    static String file = "D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\rtest.dat";

    static void display() throws IOException{

        RandomAccessFile rf = new RandomAccessFile(file,"r");
        for(int i = 0;i < 7;i++){
            System.out.println("Value " + i + ":" + rf.readDouble());
        }
        System.out.println(rf.readUTF());
        rf.close();

    }

    public static void main(String[] args) throws IOException{
        RandomAccessFile rf = new RandomAccessFile(file,"rw");
        for(int i = 0;i < 7;i++){
            rf.writeDouble(i * 1.414);
        }
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf = new RandomAccessFile(file,"rw");
        rf.seek(5 * 8);
        rf.writeDouble(47.0001);
        rf.close();
        display();

    }
}
