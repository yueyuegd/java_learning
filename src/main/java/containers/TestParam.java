package containers;

/**
 * Created by zhangyue-k on 2017/3/14.
 * User:zhangyue-k
 * Date:2017/3/14
 */
/*  每个容器都要经历一系列对test()的调用，每个都带有不同的TetsParam，TestParam包括array()用于容易的创建数组，
第一个版本接受可变参数类列表，第二个版本接受相同类型列表，但他们的值都在String中，通过这种方式可以解析命令行参数*/
public class TestParam {

    //size表示在容器中的元素数量
    public final int size;
    //loops用来控制测试的迭代次数
    public final int loops;

    public TestParam(int size, int loops) {
        this.size = size;
        this.loops = loops;
    }

    public static TestParam[] array(int... values){
        int size = values.length / 2;
        TestParam[] result = new TestParam[size];
        int n = 0;
        for(int i = 0;i < size;i++){
            result[i] = new TestParam(values[n++], values[n++]);
        }
        return result;
    }

    public static TestParam[] array(String[] values){
        int[] vals = new int[values.length];
        for(int i = 0;i < vals.length;i++){
            vals[i] = Integer.decode(values[i]);
        }
        return array(vals);
    }
}
