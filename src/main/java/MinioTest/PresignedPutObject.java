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
public class PresignedPutObject {

    public static void main(String[] args) throws InvalidPortException, InvalidEndpointException, IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InvalidExpiresRangeException, InternalException, NoResponseException, InvalidBucketNameException, XmlPullParserException, ErrorResponseException {
        MinioClient minioClient = new MinioClient("https://play.minio.io:9000","Q3AM3UQ867SPQQA43P2F"
                ,"zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG");
        //获得url并向bucket中添加文件  第三个参数仍然是过期时间
        //操作失败
        String url = minioClient.presignedPutObject("990921lc","obj.txt",60*60*24);
        System.out.println(url);
    }
}
