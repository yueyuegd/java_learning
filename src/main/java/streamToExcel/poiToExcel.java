package streamToExcel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * Created by zhangyue-k on 2017/4/21.
 * User:zhangyue-k
 * Date:2017/4/21
 */
public class poiToExcel {

    public static void main(String[] args) {

        String path = "D:" + File.separator + "project-git" + File.separator + "learnings" +  File.separator + "java_learning_FInal" + File.separator + "src" +  File.separator + "main" +  File.separator + "java" +  File.separator + "streamToExcel";
        InputStream in = null;
        OutputStream out = null;

        try{
            //输入流用于提供数据
            in = new FileInputStream(path + File.separator + "mingdandata.xlsx");
            File newFileName = new File( path + File.separator + "20170421mingdandata.xlsx");
            if(!newFileName.exists()){
                newFileName.createNewFile();
            }
            //输出流用于写入数据
            out = new FileOutputStream(newFileName);

            //将输入流中数据读到Excel文件中
            Workbook wb = new XSSFWorkbook();;
            Sheet sheet =  wb.createSheet("repeatCust");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
