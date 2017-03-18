package io;

import java.io.File;

/**
 * Created by zhangyue-k on 2017/3/16.
 * User:zhangyue-k
 * Date:2017/3/16
 */
/*  使用Direction使用工具的样本*/
public class DirectoryDemo {

    public static void main(String[] args) {
        PPrnit.pprint(Directory.walk("C://").dirs);
        for(File file:Directory.local("C://",".java")){
            System.out.print(file + " ");
        }
        System.out.println("------------------------");
        for(File file:Directory.walk("C://",".java")){
            System.out.print(file + " ");
        }
        System.out.println("=========================");
        for(File file:Directory.walk("C://",".*[Zz].*\\.java")){
            System.out.print(file + " ");
        }
    }
}
