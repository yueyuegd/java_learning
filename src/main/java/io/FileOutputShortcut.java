package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * Created by zhangyue-k on 2017/3/18.
 * User:zhangyue-k
 * Date:2017/3/18
 */
/*  一种快捷的方式来创建一个文本文件并向其中写入数据   JavaSE5在PrintWriter中添加了一个辅助构造器*/
public class FileOutputShortcut {

    static String file = "D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\FileOutputShortcut.out";

    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\FileOutputShortcut.java")
                )
        );

        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while((s = in.readLine()) != null){
            out.println(lineCount++ + ":" + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
