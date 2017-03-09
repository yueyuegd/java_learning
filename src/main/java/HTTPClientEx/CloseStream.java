package HTTPClientEx;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhangyue-k on 2017/3/9.
 * User:zhangyue-k
 * Date:2017/3/9
 */
/*  要关闭实体还有响应的流*/
public class CloseStream {
    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8080/hbNetPlugin/flex/rbac/preLogin.action");
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            if(entity != null){
                InputStream is = entity.getContent();
                try{
                    //
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    is.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(response != null){
                    response.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
