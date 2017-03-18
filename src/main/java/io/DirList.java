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
/*  使用规则的表达式来显示目录列表*/
public class DirList {

    public static void main(String[] args) {
        File path = new File("C:\\");
        File currentPath = new File(".");
        String[] list;
        String[] currentList;
        if(args.length == 0){
            list = path.list(new DirFilter("^[\\d\\w]*.java$"));
            currentList = currentPath.list(new DirFilter("^[\\d\\w]*.java$"));
        }
        else{
            list = path.list(new DirFilter(args[0]));
            currentList = path.list(new DirFilter(args[0]));
        }
        //Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(list);
        System.out.println("C:\\下面");
        for(String dirItem:list){

            System.out.print(dirItem + " ");
        }
        System.out.println();
        System.out.println("根目录下");
        for(String item:currentList){

            System.out.println(item + " ");
        }
    }



}
class DirFilter implements FilenameFilter{
    private Pattern pattern;

    public DirFilter(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    //会将目录下面的每个文件都调用一次这个方法  用于判断该文件是否包含在其中
    public boolean accept(File dir,String name){
        return pattern.matcher(name).matches();
    }
}
