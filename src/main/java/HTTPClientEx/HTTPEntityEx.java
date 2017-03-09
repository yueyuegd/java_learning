package HTTPClientEx;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by zhangyue-k on 2017/3/9.
 * User:zhangyue-k
 * Date:2017/3/9
 */
public class HTTPEntityEx {

    public static void main(String[] args) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        //HttpGet httpGet = new HttpGet("http://localhost:8080/hbNetPlugin/flex/rbac/preLogin.action");

        //HttpPost httpPost = new HttpPost("http://localhost:8080/hbNetPlugin/flex/rbac/preLogin.action");

        HttpGet httpGet = new HttpGet("http://liuwanlin.info/");

        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);

        try{
            HttpEntity entity = httpResponse.getEntity();
            if(entity != null){
                long length = entity.getContentLength();
                if(length != -1 && length < 100000){
                    System.out.println(EntityUtils.toString(entity));
                }else{
                    System.out.println("调用接口内容出错");
                }
            }

        }catch(Exception e){
            e.printStackTrace();

        }
    }
}
