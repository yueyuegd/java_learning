package io;

import org.omg.CORBA.TIMEOUT;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyue-k on 2017/3/28.
 * User:zhangyue-k
 * Date:2017/3/28
 */
//文件加锁
public class FileLocking {

    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\file.txt");
        FileLock fl = fos.getChannel().tryLock();
        if(fl != null){
            System.out.println("Locked File");
            TimeUnit.MICROSECONDS.sleep(100);
            fl.release();
            System.out.println("Released Lock");
        }
        fos.close();

    }
}
