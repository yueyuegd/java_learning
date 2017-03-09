package HTTPClientEx;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.message.BasicHttpResponse;

/**
 * Created by zhangyue-k on 2017/3/9.
 * User:zhangyue-k
 * Date:2017/3/9
 */
/**/
public class HTTPResponseEx {

    public static void main(String[] args) {

        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK,"OK");

        System.out.println(response.getProtocolVersion());

        System.out.println(response.getStatusLine().getStatusCode());

        System.out.println(response.getStatusLine().getReasonPhrase());

        System.out.println(response.getStatusLine().toString());
    }
}
