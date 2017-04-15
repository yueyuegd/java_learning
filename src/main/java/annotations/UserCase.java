package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//一个简单的注解，用它来跟踪一个项目里面的用例
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserCase {
    public int id();
    public String description() default "no description";
}
