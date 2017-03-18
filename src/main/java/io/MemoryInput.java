package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by zhangyue-k on 2017/3/18.
 * User:zhangyue-k
 * Date:2017/3/18
 */
/*  下面的示例中，从BufferedInputFile.read()读入的String结果被用来创建一个StringReader
* 然后调用read()每次读取一个字符，并把它发送到控制台*/
public class MemoryInput {

    public static void main(String[] args) throws IOException{
        StringReader in = new StringReader(BufferedInputFile.read("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\MemoryInput.java"));

        int c;
        while((c = in.read()) != -1){
            System.out.print((char) c);
        }
    }
}
