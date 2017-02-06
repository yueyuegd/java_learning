package MultipartFile_using;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zy on 2016/11/16.
 */
//用于上传文件的bean
public class FileUploadBean {

    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
