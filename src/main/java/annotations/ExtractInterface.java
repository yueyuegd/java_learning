package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//下面的自定义注解，使用它可以把一个类中的public方法提取出来，构造一个新的接口
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
    public String value();
}
