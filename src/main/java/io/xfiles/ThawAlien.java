package io.xfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by zhangyue-k on 2017/4/5.
 * User:zhangyue-k
 * Date:2017/4/5
 */
public class ThawAlien {

    public static void main(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(
                        new File("..","X.file")
                )
        );
        Object mystery = in.readObject();
        System.out.println(mystery.getClass());

    }
}
