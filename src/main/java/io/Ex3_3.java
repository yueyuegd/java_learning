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
/* 修改DirList.java  是其对所选中的文件计算文件尺寸的总和*/
public class Ex3_3 {

    public static void main(String[] args) {
        File path = new File("C:\\");

        String[] list;
        String[] currentList;
        if(args.length == 0){
            list = path.list(new DirFilter1("^[\\d\\w]*.java$"));
//            currentList = currentPath.list(new DirFilter1("^[\\d\\w]*.java$"));
        }
        else{
            list = path.list(new DirFilter1(args[0]));
//            currentList = path.list(new DirFilter1(args[0]));
        }
        //Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(list);
        System.out.println("C:\\下面");
        for(String dirItem:list){

            System.out.print(dirItem + " ");
        }
        System.out.println();
        System.out.println("根目录下");
        /*for(String item:currentList){

            System.out.println(item + " ");
        }*/
        long total = 0;
        long fs;
        for(String dirItem:list){
            fs = new File(path,dirItem).length();
            total += fs;
        }
        System.out.println("这些选中的文件大小总和:" + total);
    }




}
class DirFilter1 implements FilenameFilter {
    private Pattern pattern;

    public DirFilter1(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    //会将目录下面的每个文件都调用一次这个方法  用于判断该文件是否包含在其中
    public boolean accept(File dir,String name){
        return pattern.matcher(name).matches();
    }
}
