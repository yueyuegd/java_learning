package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by zhangyue-k on 2017/3/15.
 * User:zhangyue-k
 * Date:2017/3/15
 */
/*  因为FilenameFilte紧密地和DirList2绑定在一起，
可以进一步改进 定义一个作为list()参数的匿名内部类*/
public class DirList3 {

    public static void main(final String[] args) {
        File path = new File("C://");
        String[] list;
        if(args.length == 0){
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile("^[\\d\\w]*.java$");
                public boolean accept(File dir, String name) {

                    return pattern.matcher(name).matches();
                }
            });
        }else{
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String item:list){
            System.out.print(item + " ");
        }

    }
}
