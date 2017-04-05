package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zhangyue-k on 2017/3/20.
 * User:zhangyue-k
 * Date:2017/3/20
 */
/*  写一个程序  它接受标准输入并将所有字符喜欢换为大写  然后将结果写入到标准输出流中
*   将文件的内容重定向到该程序中*/
public class Ex21_1 {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String s;
        while((s = in.readLine()) != null && s.length() != 0){
            System.out.println(s.toUpperCase());

        }
    }
}
