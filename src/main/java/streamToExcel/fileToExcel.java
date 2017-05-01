package streamToExcel;

import java.io.*;

/**
 * Created by zhangyue-k on 2017/4/20.
 * User:zhangyue-k
 * Date:2017/4/20
 */
//普通读取  乱码并且没有Excel的格式
public class fileToExcel {

    public static void main(String[] args) {
        //输入流 读取一个Excel文件中的数据
        String path = "D:" + File.separator + "project-git" + File.separator + "learnings" +  File.separator + "java_learning_FInal" + File.separator + "src" +  File.separator + "main" +  File.separator + "java" +  File.separator + "streamToExcel";
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            FileReader fileReader = new FileReader(path + File.separator + "mingdandata.xlsx");
            in = new BufferedReader(fileReader);
            File newFileName = new File( path + File.separator + "20170420mingdandata.xlsx");
            if(!newFileName.exists()){
                newFileName.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(newFileName);
            out = new BufferedWriter(fileWriter);

            String str;
            while ((str = in.readLine()) != null){
                out.write(str);
                out.write("\\r\\n");
            }

            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
