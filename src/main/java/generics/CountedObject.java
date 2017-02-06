package generics;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
//测试通用生成器的一个普通的类
public class CountedObject {
    private static long counter = 0;
    private final long id=counter++;
    public long id(){
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject "+id;
    }
}
