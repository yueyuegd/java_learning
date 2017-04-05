package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zhangyue-k on 2017/3/28.
 * User:zhangyue-k
 * Date:2017/3/28
 */
//简单文件的复制  使用channel和buffer复制文件
public class ChannelCopy {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception{
        if(args.length != 2){
            System.out.println("arguments:sourcefile destfile");
            System.exit(1);
        }

        FileChannel in = new FileInputStream(args[0]).getChannel(),out = new FileOutputStream(args[1]).getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while(in.read(buffer) != -1){
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }

    }
}
