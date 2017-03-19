package io;

import java.io.IOException;
import java.util.*;

/**
 * Created by zhangyue-k on 2017/3/19.
 * User:zhangyue-k
 * Date:2017/3/19
 */
/*  用BinaryFile和Map<Byte,Integer>创建一个程序，他可以对在一个文件中所有不同的字节出现的次数进行计数*/
public class Ex19_2 {

    public static void main(String[] args) throws IOException{
        Map<Byte,Integer> bytesStat = new HashMap<Byte, Integer>();
        for(Byte bt:BinaryFile.read("D:\\project-git\\learnings\\java_learning_FInal\\target\\classes\\io\\Ex17_4.class")){
            Integer freq = bytesStat.get(bt);
            bytesStat.put(bt,freq == null?1:freq + 1);
        }

        List<Byte> keys = new ArrayList<Byte>(bytesStat.keySet());
        Collections.sort(keys);
        for(Byte b:keys){
            System.out.println(b + "=>" + bytesStat.get(b));
        }
    }
}
