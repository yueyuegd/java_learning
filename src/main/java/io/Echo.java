package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zhangyue-k on 2017/3/20.
 * User:zhangyue-k
 * Date:2017/3/20
 */
/*  下面的例子将直接回显你输入的每一行*/
public class Echo {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String s;
        while((s = in.readLine()) != null && s.length() != 0){
            System.out.println(s);
        }

    }
}
