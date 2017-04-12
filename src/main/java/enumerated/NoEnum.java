package enumerated;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//因为getEnumConstants()是Class的方法所以不是Enum类型的类也是可以使用的
    //但是返回的结果是null  使用的时候会发生异常
public class NoEnum {

    public static void main(String[] args) {
        Class<Integer> intClass = Integer.class;
        try{
            for(Object en:intClass.getEnumConstants()){
                System.out.println(en);
            }
            }catch(Exception e){
            System.out.println(e);
        }
    }
}
