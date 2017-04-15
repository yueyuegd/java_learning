package annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//这个是为修饰JavaBean域准备的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {

    boolean primaryKey() default false;
    boolean allowNull() default true;
    boolean unique() default false;
}
