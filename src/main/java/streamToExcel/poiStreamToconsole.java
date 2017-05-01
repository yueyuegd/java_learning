package streamToExcel;




import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;


import java.io.*;

/**
 * Created by zhangyue-k on 2017/4/21.
 * User:zhangyue-k
 * Date:2017/4/21
 */
//使用poi操作Excel文件  从一个Excel文件中读出数据然后放到一个新的Excel文件中
public class poiStreamToconsole {

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
            //开始写入操作
            Workbook book = null;
            book = WorkbookFactory.create(in);
            Sheet sheet = getSheetByNum(book,0);
            int lastRowNum = sheet.getLastRowNum();
            System.out.println("last number is "+ lastRowNum);



            for(int i = 0 ; i <= lastRowNum ; i++){
                Row row = null;
                row = sheet.getRow(i);
                if( row != null ){
                    System.out.println("reading line is " + i);
                    int lastCellNum = row.getLastCellNum();
                    System.out.println("lastCellNum is " + lastCellNum );
                    Cell cell = null;

                    for( int j = 0 ; j <= lastCellNum ; j++ ){
                        cell = row.getCell(j);
                        if( cell != null ){
                            String cellValue = cell.getStringCellValue();
                            System.out.println("cell value is \n" + cellValue);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } finally {
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static Sheet getSheetByNum(Workbook book,int number){
        Sheet sheet = null;
        try {
            sheet = book.getSheetAt(number);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return sheet;
    }

    public static Workbook getExcelWorkbook(String filePath) throws IOException{
        Workbook book = null;
        File file  = null;
        FileInputStream fis = null;

        try {
            file = new File(filePath);
            if(!file.exists()){
                throw new RuntimeException("文件不存在");
            }else{
                fis = new FileInputStream(file);
                book = WorkbookFactory.create(fis);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            if(fis != null){
                fis.close();
            }
        }
        return book;
    }
}
