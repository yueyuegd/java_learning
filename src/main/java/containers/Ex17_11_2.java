package containers;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by zhangyue-k on 2017/2/20.
 */

//创建一个类，包含一个Integer域，其值通过使用java.util.Random被初始化为0到100之间的某个值
//使用这个Integer域来实现Comparable，用这个类的对象来填充PriorityQueue，然后使用poll
//抽取这些值以展示该队列将按照我们预期的顺序产生这些值

class RandomInteger extends PriorityQueue<RandomInteger> {
    private Integer field;
    private Random rand;

    public RandomInteger() {
        this.field = rand.nextInt(100);
    }

    public int compareTo(RandomInteger randomInteger){
        if(field > randomInteger.field)
        {
            return 1;
        }else if(field == randomInteger.field)
        {
            return 0;
        }
        return -1;

    }
}
public class Ex17_11_2 {
}
