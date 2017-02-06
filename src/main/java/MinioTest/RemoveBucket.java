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
//删除bucket
public class RemoveBucket {

    public static void main(String[] args) throws InvalidPortException, InvalidEndpointException, IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InternalException, NoResponseException, InvalidBucketNameException, XmlPullParserException, ErrorResponseException {
        MinioClient minioClient = new MinioClient("https://play.minio.io:9000","Q3AM3UQ867SPQQA43P2F"
                ,"zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG");
        boolean isExist = minioClient.bucketExists("990921");
        if(isExist){
            minioClient.removeBucket("990921");
            System.out.println("bucket 990921 has successfully removed");
        }else {
            System.out.println("bucket 990921 is not exist");
        }
    }
}
