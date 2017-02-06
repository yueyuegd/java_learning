package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/16.
 */
//虽然不可以创建泛型数组  但是可以用一个引用指向泛型数组
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[]) la;
        ls[0] = new ArrayList<String>();
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();
        List<BerylliumSpere>[] lists = (List<BerylliumSpere>[]) new List[10];
        for (int i = 0;i < lists.length; i++){
            lists[i] = new ArrayList<BerylliumSpere>();
        }
    }
}
