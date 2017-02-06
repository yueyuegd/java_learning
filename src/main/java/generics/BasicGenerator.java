package generics;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
//生成一个通用的生成器
    //用于生成某个类的对象  这个类必须满足两个条件:类要是public的,必须有默认的无参构造方法
public class BasicGenerator<T> implements Generator<T>{

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
