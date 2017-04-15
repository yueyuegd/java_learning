package annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhangyue-k on 2017/4/13.
 * User:zhangyue-k
 * Date:2017/4/13
 */
//我们需要一些新的注解，用以定义与Bean关联的数据库表的名字，
// 以及与Bean属性关联的列的名字和SQL类型
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";
}
