package ArrayIntro;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zy on 2016/10/31.
 */
//asList()方法返回的是一个长度不可变的列表,数组是多长,转化得到的列表就有多长,
// 无法通过add,remove来增加或者是减少其长度
public class ArrayToList2 {

    enum Week{Sun,Mon,Tue,Web,Thu,Fri,Sat};

    public static void main(String[] args) {
        Week[] weeks = {Week.Sun,Week.Mon,Week.Tue,Week.Web,Week.Thu,Week.Fri};
        List<Week> lists = Arrays.asList(weeks);
        lists.add(Week.Sat);//异常
    }
}
