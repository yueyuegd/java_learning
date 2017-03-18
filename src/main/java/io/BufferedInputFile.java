package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by zhangyue-k on 2017/3/16.
 * User:zhangyue-k
 * Date:2017/3/16
 */
/*  缓冲输入文件*/
/*  如果想打开一个文件用于字符输入  可以使用以String或File对象作为文件名的FileInputReader
*   为了提高速度，我们希望对那个文件进行缓冲  那么我们将所产生的引用传给一个BufferedReader构造器
*   由于BufferedReader也提供readLine()方法，所以这是我们的最后对象和进行读取的接口*/
public class BufferedInputFile {

    public static String read(String filename) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine()) != null){
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
        System.out.println(read("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\BufferedInputFile.java"));
    }
}
