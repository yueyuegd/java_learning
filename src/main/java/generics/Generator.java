package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
//泛型接口
//泛型也可以用于接口中,例如生成器，一种负责创建对象的类  当使用生成器创建对象式不需要任何的参数
public interface Generator<T> {
     T next();

}
