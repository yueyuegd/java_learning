package containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhangyue-k on 2017/2/14.
 */
/*用于演示Collection中的所有基本方法   只用ArrayList来演示*/
public class CollectionMethods {

    public static void main(String[] args) {

        Collection<String> c = new ArrayList<String>();
        c.addAll(Countries.names(6));
        c.add("ten");
        c.add("eleven");
        System.out.println(c);

        Object[] array = c.toArray();
        String[] str = c.toArray(new String[0]);
        System.out.println("Collections.max(c):" + Collections.max(c));
        System.out.println("Collections.min(c:" + Collections.min(c));

        Collection<String> c2 = new ArrayList<String>();
        c2.addAll(Countries.names(6));
        c.addAll(c2);
        System.out.println(c);
        c.remove(Countries.DATA[0][0]);
        System.out.println(c);
        c.remove(Countries.DATA[1][0]);
        System.out.println(c);
        c.removeAll(c2);
        System.out.println(c);
        c.addAll(c2);
        System.out.println(c);
        String val = Countries.DATA[3][0];
        System.out.println("c.contains(" + val + "):" + c.contains(val));
        System.out.println("c.containsAll(c2):" + c.containsAll(c2));
        Collection<String> c3 = ((List<String>)c).subList(3,5);
        c2.retainAll(c3);
        System.out.println(c2);
        c2.removeAll(c3);
        System.out.println("c2.isEmpty() = " + c2.isEmpty());
        c = new ArrayList<String>();
        c.addAll(Countries.names(6));
        System.out.println(c);
        c.clear();
        System.out.println("after c.clear():" + c);

    }
}
