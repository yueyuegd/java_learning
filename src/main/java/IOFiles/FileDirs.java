package IOFiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by zhangyue_k on 2016/12/14.
 */
public class FileDirs {

    public static void main(String[] args) {
        File file = new File("D://data//files//xloan2-web//1.txt");
        /*if (!file.exists()){
            file.mkdirs();
        }
        System.out.println("创建目录成功");*/
        System.out.println("删除目录下的文件");
        try {
            FileUtils.forceDeleteOnExit(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
