package annotations;

import java.util.List;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//用于测试使用测试用例注解
public class PasswordUtils {

    @UserCase(id = 47,description = "Password must contain at least one number")
    public boolean validatePassword(String password){
        return (password.matches("\\w*\\d\\w*"));
    }


    @UserCase(id = 48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UserCase(id = 49,description = "New password cant't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords,String password){
        return !prevPasswords.contains(password);


    }
}
