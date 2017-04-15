package annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique=true);
}
