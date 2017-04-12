package enumerated;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//因为values()是由编译器插入到enum中的static方法，如果你将
    //enum向上转型为Enum的时候就无法访问到values()方法了，
    //但是在Class类中包括一个getEnumConstants()方法
    //所以就算Enum没有values()，仍然可以通过Class对象来取得所有的enum实例？？？

    enum Search{
    HITHER,YOU,
}
public class UpcastEnum {

    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER;
        //System.out.println(e.getClass());
        //System.out.println(e.getClass().getEnumConstants());
        for  (Enum en:e.getClass().getEnumConstants()){
            System.out.println(en);
        }
    }
}
