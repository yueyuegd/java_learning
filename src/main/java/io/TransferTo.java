package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * Created by zhangyue-k on 2017/3/28.
 * User:zhangyue-k
 * Date:2017/3/28
 */
public class TransferTo {

    public static void main(String[] args) throws Exception{
        if(args.length != 2){
            System.out.println("arguments:sourcefile destfile");
            System.exit(1);
        }

        FileChannel in = new FileInputStream(args[0]).getChannel(),out = new FileOutputStream(args[1]).getChannel();
        in.transferTo(0,in.size(),out);

    }
}
