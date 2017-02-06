package MinioTest;

import io.minio.MinioClient;
import io.minio.Result;
import io.minio.errors.*;
import io.minio.messages.Upload;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zhangyue_k on 2016/11/30.
 */
public class ListIncompleteUploads {

    public static void main(String[] args) throws InvalidPortException, InvalidEndpointException, IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InternalException, NoResponseException, InvalidBucketNameException, XmlPullParserException, ErrorResponseException {
        MinioClient minioClient = new MinioClient("https://play.minio.io:9000","Q3AM3UQ867SPQQA43P2F"
                ,"zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG");
        boolean isExist = minioClient.bucketExists("990921lc");
        if(isExist){
            Iterable<Result<Upload>> listIncompleteUpload = minioClient.listIncompleteUploads("990921lc");
            for(Result<Upload> result:listIncompleteUpload){
                Upload upload = result.get();
                System.out.println(upload.uploadId()+","+upload.objectName());
            }
        }else {
            System.out.println("bucket 990921lc is not exist");
        }
    }
}
