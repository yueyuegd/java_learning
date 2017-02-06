package FinalKeywords;

import java.util.Random;

/**
 * Created by zy on 2016/10/30.
 */
public class FinalTest {

    //编译期常量,必须要初始化,不能改变
    private  final String final_01 = "kai";
    //构造器常量,在实例化一个对象时被初始化
    private final String final_02;

    private static Random random = new Random();
    //利用随机数来初始化常量值
    private final int final_03 = random.nextInt(50);

    //引用常量
    private final Person final_04 = new Person("kai");

    public FinalTest(String final_02) {
        this.final_02 = final_02;
    }

    @Override
    public String toString() {
        return "FinalTest{" +
                "final_01='" + final_01 + '\'' +
                ", final_02='" + final_02 + '\'' +
                ", final_03=" + final_03 +
                ", p=" + final_04.getName() +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("=====第一次创建对象=====");
        FinalTest final1 = new FinalTest("kai");
        System.out.println(final1);
        System.out.println("=====第二次创建对象=====");
        FinalTest final2 = new FinalTest("wjk");
        System.out.println(final2);
        System.out.println("=====修改引用对象=====");
        final2.final_04.setName("kk");
        System.out.println(final2);
    }
}
