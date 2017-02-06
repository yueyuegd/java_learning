package MultipartFile_using;

import org.springframework.validation.BindException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zy on 2016/11/16.
 */
//用于上传文件的Controller层
public class FileUploadController extends SimpleFormController {

    protected ModelAndView onSubmit(HttpServletRequest request,
                                    HttpServletResponse response,
                                    Object command,
                                    BindException errors){

        try{
            FileUploadBean bean = (FileUploadBean) command;
            MultipartFile file = bean.getFile();
            if(file==null){
                throw new Exception("上传失败:文件为空");
            }
            if(file.getSize()>10000000){
                throw new Exception("上传失败:上传的文件大小不能超过10M");
            }

            //得到文件名
            String filename = file.getOriginalFilename();

            if(file.getSize()>0){
                try{
                    SaveFileFromInputStream(file.getInputStream(),"D:/",filename);

                }catch(IOException e){
                    System.out.println(e.getMessage());
                    return null;

                }
            }else{
                throw new Exception("上传失败:上传文件不能为空");
            }

            try{

                return super.onSubmit(request,response,command,errors);

            }catch(Exception e){
                System.out.println(e.getMessage());
                return null;

            }



        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;

        }

    }

    //保存文件
    public void SaveFileFromInputStream(InputStream stream,
                                        String path,String filename) throws IOException{
        FileOutputStream fs = new FileOutputStream(path+"/"+filename);
        byte[] buffer = new byte[1024*1024];
        int bytesum=0;
        int byteread=0;
        while((byteread=stream.read(buffer))!=-1){
            bytesum +=byteread;
            fs.write(buffer,0,byteread);
            fs.flush();

        }
        fs.close();
        stream.close();



    }
}
