package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//创建容器
public class ListMaker<T> {
    List<T> create(){
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringListMaker = new ListMaker<String>();
        List<String> list = stringListMaker.create();
    }
}
