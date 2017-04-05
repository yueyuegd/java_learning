package io;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by zhangyue-k on 2017/4/5.
 * User:zhangyue-k
 * Date:2017/4/5
 */
/*  */
public class FreezeAlien{
    public static void main(String[] args)  throws Exception{
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\X.file")
        );
        Alien quellek = new Alien();
        out.writeObject(quellek);
    }
}
