package containers;

import generics.Generator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by zhangyue-k on 2017/2/20.
 */
//下面是Queue的基本用法，包括基于并发的Queue，可以将元素从队列的一头进去并从另一端抽取出来
public class QueueBehavior {

    private static int count = 10;
    static <T> void test(Queue<T> queue, Generator<T> gen){
        for(int i =0;i < count;i++){
            queue.offer(gen.next());
        }

        //对头元素不为空
        while(queue.peek() != null){
            //删掉该元素并返回该元素
            System.out.print(queue.remove() + " ");
        }

        System.out.println();
    }

    static class Gen implements Generator<String>{
        String[] s = ("one two three four five six seven eight nine ten").split(" ");
        int i;
        public String next(){
            return s[i++];
        }
    }


    public static void main(String[] args) {
        test(new LinkedList<String>(),new Gen());
        test(new PriorityQueue<String>(),new Gen());
        test(new ArrayBlockingQueue<String>(count),new Gen());
        test(new ConcurrentLinkedQueue<String>(),new Gen());
        test(new LinkedBlockingQueue<String>(),new Gen());
        test(new PriorityBlockingQueue<String>(),new Gen());
    }

}
