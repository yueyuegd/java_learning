package HTTPClientEx;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * Created by zhangyue-k on 2017/3/9.
 * User:zhangyue-k
 * Date:2017/3/9
 */
public class HTTPRequestEx1 {

    public static void main(String[] args) {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8080/hbNetPlugin/flex/rbac/preLogin.action");
        CloseableHttpResponse httpResponse = null;
        try {
            httpResponse = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(httpResponse != null) {
                    httpResponse.close();
                }
                }catch(Exception e){
                   e.printStackTrace();
                }
            }
        }
    }

