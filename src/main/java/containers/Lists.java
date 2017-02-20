package containers;

import java.util.*;

/**
 * Created by zhangyue-k on 2017/2/16.
 */
public class Lists {

    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    //下面的方法中包括每一个list都可以执行的方法
    public static void basicTest(List<String> a){
        a.add(1,"X");
        a.add("X");
        //加入一个集合
        a.addAll(Countries.names(25));
        a.addAll(3,Countries.names(25));

        b = a.contains("1");
        System.out.println(b);

        b = a.containsAll(Countries.names(25));
        System.out.println(b);

        s = a.get(1);
        System.out.println(s);

        i = a.indexOf("1");
        System.out.println(i);

        b = a.isEmpty();
        System.out.println(b);

        it = a.iterator();
        lit = a.listIterator();
        lit = a.listIterator(3);

        i = a.lastIndexOf("1");
        System.out.println(i);

        a.remove(1);
        a.remove("3");
        a.set(1,"y");

        a.retainAll(Countries.names(25));
        a.removeAll(Countries.names(25));
        i = a.size();
        System.out.println(i);
        a.clear();

    }


    //该方法使用iterator来遍历list元素
    public static void iterMotion(List<String> a){
        ListIterator<String> lit = a.listIterator();
        b = lit.hasNext();
        System.out.println(b);
        b = lit.hasPrevious();
        System.out.println(b);
        s = lit.next();
        System.out.println(s);
        i = lit.nextIndex();
        System.out.println(i);
        s = lit.previous();
        System.out.println(s);
        i = lit.previousIndex();
        System.out.println(i);
    }

    //该方法使用Iterator修改元素

    public static void iterManipulation(List<String> a){

        ListIterator<String> listIterator = a.listIterator();
        listIterator.add("47");
        listIterator.next();
        //?   remove()的用法
        listIterator.remove();
        listIterator.next();
        listIterator.set("47");
        System.out.println(a);

    }

    public static void testVisual(List<String> a){
        System.out.println(a);

        List<String> b = Countries.names(25);
        System.out.println("b = " + b);
        a.addAll(b);
        a.addAll(b);
        System.out.println(a);

        ListIterator<String> x = a.listIterator(a.size() / 2);
        x.add("one");
        System.out.println(a);
        System.out.println(x.next());
        x.remove();
        System.out.println(x.next());
        x.set("47");
        System.out.println(a);
        x = a.listIterator(a.size());
        while(x.hasPrevious()){
            System.out.println(x.previous() + " ");
            System.out.println("testVisual finished");
        }

    }


    //下面的方法显示只有LinkedList可以的操作
    public static void testLinkedLlist(){
        LinkedList<String> ll = new LinkedList<String>();
        ll.addAll(Countries.names(25));
        System.out.println(ll);
        ll.addFirst("one");
        ll.addFirst("two");

        System.out.println(ll.getFirst());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());

        System.out.println(ll.removeLast());
        System.out.println(ll);

    }

    public static void main(String[] args) {

        /*basicTest(new LinkedList<String>(Countries.names(25)));

        basicTest(new ArrayList<String>(Countries.names(25)));

        iterMotion(new LinkedList<String>(Countries.names(25)));

        iterMotion(new ArrayList<String>(Countries.names(25)));*/

        iterManipulation(new LinkedList<String>(Countries.names(25)));

        /*iterManipulation(new ArrayList<String>(Countries.names(25)));

        testVisual(new LinkedList<String>(Countries.names(25)));

        testLinkedLlist();*/


    }
}
