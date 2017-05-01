package containers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyue-k on 2017/3/15.
 * User:zhangyue-k
 * Date:2017/3/15
 */
/*  List排序与查询所使用的方法与对象数组所使用的相应方法有相同的名字与语法
*   只是用Collections的static方法代替Arrays的方法*/
public class ListSortSearch {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Utilities.list);
        list.addAll(Utilities.list);
        System.out.println(list);
    }
}
