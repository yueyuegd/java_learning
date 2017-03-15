package containers;

/**
 * Created by zhangyue-k on 2017/3/14.
 * User:zhangyue-k
 * Date:2017/3/14
 */
/* 测试框架 */
public abstract class Test<C> {
    String name;
    public Test(String name){
        this.name = name;
    }

    abstract int test(C container, TestParam tp);

}
