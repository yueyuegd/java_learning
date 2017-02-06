package ExceptionHandler;

/**
 * Created by zy on 2016/10/31.
 */
//自定义异常的测试类
public class Test {

    public void display(int i)throws MyException{
        if(i==0){
            throw new MyException("i的值不能为0.....");
        }else{
            System.out.println(i/2);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.display(0);
            System.out.println("============");
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
