package io;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

/**
 * Created by zhangyue-k on 2017/3/28.
 * User:zhangyue-k
 * Date:2017/3/28
 */
//缓冲器容纳的都是普通的字节   为了把他们转换成字符
    //要么在输入的时候对其进行编码  要么在输出的时候对其进行解码
    //可以使用java.nio.charset.Charset类来实现  该类可以把数据编码成多种不同类型的字符集
public class AvailableCharSets {

    public static void main(String[] args) {
        SortedMap<String, Charset> charSets = Charset.availableCharsets();

        Iterator<String> it = charSets.keySet().iterator();
        while(it.hasNext()){
            String csName = it.next();
            System.out.print(csName);
            Iterator aliases = charSets.get(csName).aliases().iterator();
            if(aliases.hasNext()){
                System.out.print(":");
            }
            while (aliases.hasNext()){
                System.out.print(aliases.next());
                if(aliases.hasNext()){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
