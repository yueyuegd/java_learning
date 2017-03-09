package HTTPClientEx;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by zhangyue-k on 2017/3/9.
 * User:zhangyue-k
 * Date:2017/3/9
 */
/* httpCLient提供了一个简单的工具类用于生成和修改URI*/
public class URIs {

    public static void main(String[] args) {
        try {
            URI uri = new URIBuilder().setScheme("http").setHost("www.google.com").setPath("/search").
                    setParameter("q","httpclient").setParameter("btnG","Google Search").setParameter("aq","f").
                    setParameter("oq","").build();
            HttpGet httpGet = new HttpGet(uri);
            System.out.println(httpGet.getURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
