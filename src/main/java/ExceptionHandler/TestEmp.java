package ExceptionHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by zy on 2016/10/31.
 */
//异常链
public class TestEmp {

    public void f() throws MyException{
        try{

            FileReader reader = new FileReader("D:"+ File.separator
                    +"myfiles"+File.separator+"structs.txt");
            Scanner in = new Scanner(reader);
            System.out.println(in.next());

        }catch (FileNotFoundException e){
            throw new MyException("文件没有找到---01",e);
        }
    }

    public void g() throws MyException{
        try{
            f();
        }catch(MyException e){
            throw new MyException("没有找到文件---02",e);
        }
    }

    public static void main(String[] args) {
        TestEmp example = new TestEmp();
        try {
            example.g();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
