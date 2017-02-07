package containers;

import generics.Generator;
import net.maindview.util.CollectionData;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by zhangyue-k on 2017/2/6.
 */
//初始化LinkedHashSet的一个实例

class Government implements Generator<String>{
    String[] foundation = ("strange woman lying in ponds "
            + "distributing swords is no basis for a system of "
            + "government" ).split(" ");
    private int index;
    public String next(){
        return foundation[index++];
    }
}
public class CollectionDataTest {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(),15));
        System.out.println(new CollectionData<String>(new Government(),15));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(),15));
        System.out.println(set);
    }
}
