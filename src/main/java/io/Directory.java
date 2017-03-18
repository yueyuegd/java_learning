package io;

import sun.reflect.generics.tree.Tree;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by zhangyue-k on 2017/3/15.
 * User:zhangyue-k
 * Date:2017/3/15
 */
/*目录实用工具
* 有一种工具可以为你产生文件集  可以通过下面的程序中的local()方法产生由本地目录中的文件构成的File对象数组
* 或者是通过walk()方法产生给定目录下的由整个目录树中所有文件构成的List<File>*/
public final class Directory {

    public static File[] local(File dir,final String regex){
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String path,final String regex){
        return local(new File(path),regex);

    }

    public static class TreeInfo implements Iterable<File>{
        public List<File> files = new ArrayList<File>();
        public List<File> dirs = new ArrayList<File>();

        public Iterator<File> iterator() {
            return files.iterator();
        }
        void addAll(TreeInfo other){
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        public String toString(){
            return "dirs: " + dirs + "\n\nfiles: " + files;
        }
    }
    public static TreeInfo walk(String start,String regex){
        return recureseDirs(new File(start),regex);
    }

    public static TreeInfo walk(File start,String regex){

        return recureseDirs(start,regex);
    }

    public static TreeInfo walk(String start){
        return recureseDirs(new File(start),".*");
    }

    static TreeInfo recureseDirs(File startDir,String regex){
        TreeInfo result = new TreeInfo();
        for(File item:startDir.listFiles()){
            if(item.isDirectory()){
                result.dirs.add(item);
                result.addAll(recureseDirs(item,regex));
            }else{
                if(item.getName().matches(regex)){
                    result.files.add(item);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println(walk("."));
        }
    }

}
