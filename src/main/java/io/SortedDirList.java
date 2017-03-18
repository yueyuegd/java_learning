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
/*  创建一个SortedDirList的类，他具有一个可以接受文件路径信息，并能构建该路径下所有文件的
* 排序目录列表的构造器  向这个类添加两个重载的list方法:一个产生整个列表，
* 另一个产生与其参数(一个正则表达式)相匹配的列表的子集*/
public class SortedDirList {
    //路劲信息
    private File path;

    public SortedDirList(File path) {
        this.path = path;

    }

    public SortedDirList() {
        this.path = new File("C://");
    }

    public String[] list(){
        String[] list = path.list();
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        return list;
    }

    public String[] list(String regex){
        String[] list = path.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile("^[\\d\\w]*.java$");
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        return list;

    }


}
