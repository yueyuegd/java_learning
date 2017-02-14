package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhangyue-k on 2017/2/14.
 */

/* 创建一个list(使用ArrayList和LinkedList都尝试一下)，然后使用Countries来填充，
 * 对该列表排序并打印，然后将
 * Collections.shuffle()方法重复的应用于该列表，并每次都打印它
 * 如何将列表随机打乱的？？？*/
public class Ex17_1 {

    public static void main(String[] args) {

        //创建并填充
        List<String> listRandom1 = new ArrayList<String>();
        listRandom1.addAll(Countries.names(10));
        System.out.println("原始数据:" + listRandom1);

        List<String> listRandom2 = new LinkedList<String>();
        listRandom2.addAll(Countries.names(10));
        System.out.println("原始数据:" + listRandom2);


        //排序并打印
        Collections.sort(listRandom1);
        System.out.println("排序之后:" + listRandom1);
        Collections.sort(listRandom2);
        System.out.println("排序之后:" + listRandom2);


        //使用shuffle方法
        Collections.shuffle(listRandom1);
        System.out.println("第一次使用shuffle():" + listRandom1);
        Collections.shuffle(listRandom2);
        System.out.println("第一次使用shuffle():" + listRandom2);

        Collections.shuffle(listRandom1);
        System.out.println("第二次使用shuffle():" + listRandom1);
        Collections.shuffle(listRandom2);
        System.out.println("第二次使用shuffle():" + listRandom2);

        Collections.shuffle(listRandom1);
        System.out.println("第三次使用shuffle():" + listRandom1);
        Collections.shuffle(listRandom2);
        System.out.println("第三次使用shuffle():" + listRandom2);

        Collections.shuffle(listRandom1);
        System.out.println("第四次使用shuffle():" + listRandom1);
        Collections.shuffle(listRandom2);
        System.out.println("第四次使用shuffle():" + listRandom2);

        Collections.shuffle(listRandom1);
        System.out.println("第五次使用shuffle():" + listRandom1);
        Collections.shuffle(listRandom2);
        System.out.println("第五次使用shuffle():" + listRandom2);

    }
}
