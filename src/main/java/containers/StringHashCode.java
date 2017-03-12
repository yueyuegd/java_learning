package containers;

/**
 * Created by zhangyue-k on 2017/3/12.
 * User:zhangyue-k
 * Date:2017/3/12
 */
/*  如果程序中有多个String对象，都包含相同的字符串序列，那么这些String对象都映射到同一块内存区域
* 所以new String("Hello")生成的两个实例，虽然是相互独立的，但是对他们使用hashCode()应该生成同样的结果*/
public class StringHashCode {

    public static void main(String[] args) {
        String[] hellos = "Hello Hello".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.println(hellos[1].hashCode());
    }
}
