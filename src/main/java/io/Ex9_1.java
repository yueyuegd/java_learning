package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by zhangyue-k on 2017/3/18.
 * User:zhangyue-k
 * Date:2017/3/18
 */
/*  修改练习8 强制ArrayList中的所有行变成大写形式  并将结果发给System.out*/
public class Ex9_1 {

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

    //将ArrayList中所有行都变成大写形式
    public List<String> changeUpcase(List<String> content){

    }

    public static void main(String[] args) throws IOException{
        List<String> content = read("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\Ex7_2");

        printReverse(content);
    }

}
