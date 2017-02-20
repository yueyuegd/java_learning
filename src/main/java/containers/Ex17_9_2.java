package containers;

import net.maindview.util.CollectionData;
import net.maindview.util.RandomGenerator;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by zhangyue-k on 2017/2/20.
 */

//使用RandomGenerator.String来填充TreeSet，但是要使用字母排序，打印这个TreeSet并验证其排序顺序
public class Ex17_9_2 {

    public static void main(String[] args) {

        SortedSet<String> sortedSet = new TreeSet<String>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        sortedSet.addAll(CollectionData.list(new RandomGenerator.String(),10));
        System.out.println("sortedSet:" + sortedSet);


    }



}
