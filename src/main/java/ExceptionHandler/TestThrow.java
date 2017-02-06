package ExceptionHandler;

/**
 * Created by zy on 2016/11/2.
 */
//用来测试使用throw语句之后的执行情况
public class TestThrow {

    public static void testThrow(int i) throws Exception{

            if(i==0){
                System.out.println("11111");
                throw new Exception();
            }
            System.out.println("2222222");

    }

    public static void main(String[] args){
        try {
            testThrow(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
