package io;

import java.io.PrintWriter;

/**
 * Created by zhangyue-k on 2017/3/20.
 * User:zhangyue-k
 * Date:2017/3/20
 */
/*  System.out是一个PrintStream，PrintStream是一个OutputStream，
*   PrintWriter有一个可以接受OutputStream作为参数的构造器，因此只要需要就可以
*   使用这个构造器把System.out转换为PrintWriter*/
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out,true);
        out.println("Hello,world");
    }
}
