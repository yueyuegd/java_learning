package stringClass;

/**
 * Created by zy on 2016/10/30.
 */
//字符串的拼接方式:+  concat()  append()
    //比较他们之间的工作效率
public class StringTest {

    public static void main(String[] args) {
        //+
        long start_01 = System.currentTimeMillis();
        String a = "a";
        for (int i = 0; i < 100000; i++) {
            a += "b";
        }
        long end_01 = System.currentTimeMillis();
        System.out.println("+所耗费的时间是:" + (end_01 - start_01) + "毫秒");


        //concat()
        long start_02 = System.currentTimeMillis();
        String c = "c";
        for (int i = 0; i < 100000; i++) {
            c.concat("d");
        }
        long end_02 = System.currentTimeMillis();
        System.out.println("concat()所耗费的时间是:" + (end_02 - start_02) + "毫秒");

        //append()
        long start_03 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("e");
        for (int i = 0; i < 100000; i++) {
            sb.append("f");
        }
        long end_03 = System.currentTimeMillis();
        System.out.println("append()所耗费的时间是:" + (end_03 - start_03) + "毫秒");
    }
}
