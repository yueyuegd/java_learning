package annotations.database;

/**
 * Created by zhangyue-k on 2017/4/15.
 * User:zhangyue-k
 * Date:2017/4/15
 */
//简单的定义一个bean，使用以上定义过的注解
@DBTable(name="MEMBER")
public class Member {
    @SQLString(30)
    String firstName;
    @SQLString(50)
    String lastName;
    @SQLInteger
    Integer age;
    @SQLString(value=30,constraints = @Constraints(primaryKey=true))
    String handle;
    static int memberCount;
    public String getHandle(){
        return handle;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

   public String toString(){
        return handle;
    }

    public Integer getAge() {
        return age;
    }
}
