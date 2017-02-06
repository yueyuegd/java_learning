package MinioTest;

import io.minio.MinioClient;
import io.minio.PostPolicy;
import io.minio.errors.*;
import org.joda.time.DateTime;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * Created by zhangyue_k on 2016/11/30.
 */
public class PresignedPostPolicy {

    public static void main(String[] args) throws InvalidPortException, InvalidEndpointException, InvalidArgumentException, IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InternalException, NoResponseException, InvalidBucketNameException, XmlPullParserException, ErrorResponseException {
        MinioClient minioClient = new MinioClient("https://play.minio.io:9000","Q3AM3UQ867SPQQA43P2F"
                ,"zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG");
        //创建一个postPolicy对象  过期时间为7天之后
        PostPolicy policy = new PostPolicy("990921lc","E://文档//个人图片//qx1.jpg", DateTime.now().plusDays(7));
        //指定上传的文件必须是以下的格式
        policy.setContentType("image/jpg");
        Map<String,String> formData = minioClient.presignedPostPolicy(policy);
        //System.out.println(formData.entrySet().toString());
        //上传失败
        System.out.print("curl -X POST ");
        for(Map.Entry<String,String> entry:formData.entrySet()){
            System.out.print(" -F " + entry.getKey() + "=" + entry.getValue());
        }
        System.out.println(" -F file=E:/文档/个人图片/qx1.jpg https://play.minio.io:9000/990921lc");
    }
}
