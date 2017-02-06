package MinioTest;

import io.minio.MinioClient;
import io.minio.errors.*;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zhangyue_k on 2016/11/30.
 */
//测试Minio上传文件
public class FileUploader {
    public static void main(String[] args) throws IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InternalException, NoResponseException, InvalidBucketNameException, XmlPullParserException, ErrorResponseException, InvalidArgumentException {
        try {
            MinioClient minio = new MinioClient("https://play.minio.io:9000","Q3AM3UQ867SPQQA43P2F"
                    ,"zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG");
            //检查要上传的目录是否存在
            boolean isExist = minio.bucketExists("990921lc");
            if(isExist){
                System.out.println("Bucket already exists.");
            }else{
                minio.makeBucket("990921lc");
            }
            //存入文件
            minio.putObject("990921lc","tf1.jpg","E://文档//个人图片//tf1.jpg");
            System.out.println("E://文档//个人图片//tf1.jpg is successfully uploaded as tf1.jpg to `990921lc` bucket.");
        } catch (InvalidEndpointException e) {
            e.printStackTrace();
            System.out.println("Error occurred: " + e);
        } catch (InvalidPortException e) {
            e.printStackTrace();
            System.out.println("Error occurred: " + e);
        }
    }
}
