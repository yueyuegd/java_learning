package ExceptionHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by zy on 2016/10/30.
 */
public class ExceptionTest {

    public static void main(String[] args) {
        String file = "D:"+ File.separator+"exceptionTest.txt";
        FileReader fileReader;
        try{
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            String string = scanner.next();
            System.out.println(string+"不知道是否有幸可以执行到这里....");
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("对不起,你执行不到.....");
        }finally {
            System.out.println("finally在执行.....");
        }

    }
}
