package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zhangyue-k on 2017/3/28.
 * User:zhangyue-k
 * Date:2017/3/28
 */
//用以对流FileInputStream，FileOutputStream,RandomAccessFile产生可写的，
// 可读可写以及可读的通道
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception{
        FileChannel fc = new FileOutputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();

        fc = new RandomAccessFile("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Data.txt","rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        fc = new FileInputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Data.txt").getChannel();
        ByteBuffer  buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while(buff.hasRemaining()){
            System.out.print((char) buff.get());
        }


    }

}
