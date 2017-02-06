package MinioTest;

import io.minio.MinioClient;
import io.minio.Result;
import io.minio.errors.*;
import io.minio.messages.Item;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zhangyue_k on 2016/11/30.
 */
public class ListObjects {
    public static void main(String[] args) throws InvalidPortException, InvalidEndpointException, IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InternalException, NoResponseException, InvalidBucketNameException, XmlPullParserException, ErrorResponseException {
        MinioClient minioClient = new MinioClient("https://play.minio.io:9000","Q3AM3UQ867SPQQA43P2F"
                ,"zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG");
        boolean found = minioClient.bucketExists("990921lc");
        //重要的解析
        if(found){
            Iterable<Result<Item>> listObjest = minioClient.listObjects("990921lc");
            for(Result<Item> result:listObjest){
                Item item = result.get();
                System.out.println(item.lastModified()+","+item.objectSize()+","+item.objectName());
            }
        }else{
            System.out.println("990921lc does not exist");
        }
    }
}
