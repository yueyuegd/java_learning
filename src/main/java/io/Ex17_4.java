package io;

import java.util.*;

/**
 * Created by zhangyue-k on 2017/3/19.
 * User:zhangyue-k
 * Date:2017/3/19
 */
/*  用TextFile和Map<Character,Integer>创建一个程序，
    它可以对在一个文件中所有不同的字符出现的次数进行计数*/
public class Ex17_4 {

    public static void main(String[] args) {


        Map<Character, Integer> counts = new HashMap<Character, Integer>();
       /* String content = TextFile.read(fileName);
        String[] contentArray = content.split("\n");
        for(String item:contentArray){
            char[] charArray = item.toCharArray();
            for(char c:charArray){
                int index = 1;
                counts.put(c,index++);
            }
        }*/
        for (String word : new TextFile("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\test3.txt", "\\W+")) {
            for (int i = 0; i < word.length(); i++) {
                Character ch = word.charAt(i);
                Integer freq = counts.get(ch);
                counts.put(ch, freq == null ? 1 : freq + 1);
            }
        }
        List<Character> keys = Arrays.asList(counts.keySet().toArray(new Character[0]));
        Collections.sort(keys);
        for (Character c : keys) {
            System.out.println(c + "=>" + counts.get(c));
        }
    }

}
