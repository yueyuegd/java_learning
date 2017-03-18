package io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by zhangyue-k on 2017/3/18.
 * User:zhangyue-k
 * Date:2017/3/18
 */

/*  要读取格式化的数据可以使用DataInputStream  它是一个面向字节的I/O类*/
/*  如果我们使用readByte()来一次一个字节地读取字符  那么任何字节的值都是合法的结果
*   因此返回值不能用来检测输入是否结束  我们可以使用avaliable()来查看还有多少可供读取的字符*/
public class FormattedMemoryInput {

    public static void main(String[] args) throws IOException{


        try{

            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\FormattedMemoryInput.java").getBytes()
                    )
            );
            while(true)
                System.out.print((char) in.readByte());

        }catch(EOFException e){
            System.err.println("End of stream");
        }
    }


}
