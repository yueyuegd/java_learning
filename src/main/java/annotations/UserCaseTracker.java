package annotations;



import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//注解处理器
    //列出PasswordUtils中找到的用例，以及缺失的用例
public class UserCaseTracker {
    public static void trackUserCases(List<Integer> useCases,Class<?> cl){
        for(Method m:cl.getDeclaredMethods()){

            UserCase uc = m.getAnnotation(UserCase.class);
            if(uc != null){
                System.out.println("Found Use Case:" + uc.id() + " " + uc.description());
                useCases.remove(new Integer(uc.id()));
            }

        }
        for(int i:useCases){
            System.out.println("Worning: Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> userCases = new ArrayList<Integer>();
        Collections.addAll(userCases,47,48,49,50);
        trackUserCases(userCases,PasswordUtils.class);
    }

}
