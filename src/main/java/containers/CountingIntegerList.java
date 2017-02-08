package containers;

import java.util.AbstractList;

/**
 * Created by zhangyue-k on 2017/2/8.
 */
//下面的这个类可以拥有任意的尺寸，并且用Integer可以有效地进行预初始化
public class CountingIntegerList extends AbstractList<Integer>{

    private int size;

    public CountingIntegerList(int size) {
        this.size = size < 0?0:size;
    }

    @Override
    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(30));
    }
}
