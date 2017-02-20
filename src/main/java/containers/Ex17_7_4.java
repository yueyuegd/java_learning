package containers;

import java.util.*;

/**
 * Created by zhangyue-k on 2017/2/16.
 */

//分别创建一个ArrayList和LinkedList,用Countries.names()生成器来填充每个容器,用普通的Iterator打印
//每个列表，然后用ListIterator按隔一个位置插入一个对象的方式把一个表插入到另一个表中
//现在，从第一个表的末尾开始，向前移动执行插入的操作
public class Ex17_7_4 {

    public static void main(String[] args) {

        List<String> insertedList = new ArrayList<String>(Countries.names(3));
        System.out.println("表insertedList被插入之前:" + insertedList);
        Iterator<String> insertedIterator = insertedList.iterator();
        System.out.println("使用Iterator遍历表insertedList:");
        while (insertedIterator.hasNext()){
            System.out.print(insertedIterator.next() + " ");
        }

        System.out.println();

        List<String> insertList = new LinkedList<String>(Countries.names(3));
        System.out.println("表insertList插入另一个表之前:" + insertList);
        Iterator<String> insertIterator = insertList.iterator();
        System.out.println("使用Iterator遍历表insertList:");
        while(insertIterator.hasNext()){
            System.out.print(insertIterator.next() + " ");
        }

        System.out.println();

        System.out.println("执行从第一个元素开始的插入操作:");
        ListIterator<String> insertedListIterator = insertedList.listIterator();
        ListIterator<String> insertListIterator = insertList.listIterator();
        while(insertListIterator.hasNext()){
            insertedListIterator.add(insertListIterator.next());
            insertedListIterator.next();
        }
        System.out.println("执行插入操作结束后:" + insertedList);


        System.out.println("执行从末尾元素开始的插入操作:");
        insertedList = new ArrayList<String>(Countries.names(3));
        insertList = new LinkedList<String>(Countries.names(3));
        ListIterator<String> isertedListIteratorNew = insertedList.listIterator(insertedList.size());
        ListIterator<String> insertListIteratorNew = insertList.listIterator();
        while(insertListIteratorNew.hasNext()){
            isertedListIteratorNew.previous();
            System.out.println(insertedListIterator.previousIndex());
            System.out.println(insertedListIterator.nextIndex());
            isertedListIteratorNew.add(insertListIteratorNew.next());

        }
        System.out.println("执行完尾部插入操作结束后:" + insertedList);
    }
}
