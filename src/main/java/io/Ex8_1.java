package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by zhangyue-k on 2017/3/17.
 * User:zhangyue-k
 * Date:2017/3/17
 */
/*修改练习7  使要读取的文件的名字以命令行参数的形式来提供*/
public class Ex8_1 {

    //用于读取文本文件中内容的方法
    private static List<String> read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String content;
        content = in.readLine();
        List<String> contentList = new LinkedList<String>();
        try {
            while (content != null) {
                contentList.add(content);
                content = in.readLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            in.close();
        }

        return contentList;
    }

    //该方法用于将读出来的内容以相反的顺序打出来
    public static void printReverse(List<String> contentList){
        ListIterator<String> reverseIterator = contentList.listIterator(contentList.size());
        while(reverseIterator.hasPrevious()){
            System.out.println(reverseIterator.previous());
        }

    }

    public static void main(String[] args) throws IOException{
        if(args.length == 0){
            System.out.println("请给出文件名");
        }else{
            List<String>  content = read(args[0]);
            printReverse(content);
        }
    }
}
