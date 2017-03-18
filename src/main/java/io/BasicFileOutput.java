package io;

import java.io.*;

/**
 * Created by zhangyue-k on 2017/3/18.
 * User:zhangyue-k
 * Date:2017/3/18
 */
/*  FileWriter对象可以向文件写入数据  在本例中为了格式化机制   FileWriter被装饰成PrintWriter
* 按照这样的方式创建的数据文件可以作为普通文本文件读取*/
public class BasicFileOutput {

    static String file = "D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\BasicFileOutput.out";

    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\BasicFileOutput.java")
                )
        );

        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file)
                )
        );
        int lineCount = 1;
        String s;
        while((s = in.readLine()) != null){
            out.println(lineCount++ + ":" + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }

}
