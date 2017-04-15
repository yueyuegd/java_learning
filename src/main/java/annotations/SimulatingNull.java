package annotations;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhangyue-k on 2017/4/13.
 * User:zhangyue-k
 * Date:2017/4/13
 */
//自己定义一些特殊的值，例如空字符串或者是负数，来表示某个元素不存在
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {

    public int id() default -1;
    public String description() default "";
}
