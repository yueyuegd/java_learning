package MinioTest;

import com.google.common.base.Charsets;
import io.minio.MinioClient;
import io.minio.errors.*;
import org.xmlpull.v1.XmlPullParserException;
import sun.nio.cs.StandardCharsets;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zhangyue_k on 2016/11/30.
 */
//获取某个文件
public class GetObject {

    public static void main(String[] args) throws InvalidPortException, InvalidEndpointException, IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InternalException, NoResponseException, InvalidBucketNameException, XmlPullParserException, ErrorResponseException, InvalidArgumentException {
        MinioClient minioClient = new MinioClient("https://play.minio.io:9000","Q3AM3UQ867SPQQA43P2F"
                ,"zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG");
        //statObject(bucketName,objectName)用来检测该bucket中是否有这个文件
        //如果没有的话该方法会抛出异常   如果该方法成功执行则说明有该文件
        minioClient.statObject("990921lc","test.txt");
        //创建一个输入流来读取从Minio中得到的数据
        InputStream inputStream = minioClient.getObject("990921lc","test.txt");
        //读取输入流中的数据并输出到控制台
        byte[] buf = new byte[16384];
        int resLenth;
        while((resLenth=inputStream.read(buf,0,buf.length))>=0){
            System.out.println(new String(buf,0,resLenth, Charsets.UTF_8));
        }
        inputStream.close();
    }
}
