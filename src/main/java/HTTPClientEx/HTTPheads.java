package HTTPClientEx;

import org.apache.http.*;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.message.BasicHttpResponse;

/**
 * Created by zhangyue-k on 2017/3/9.
 * User:zhangyue-k
 * Date:2017/3/9
 */
/* 可以使用httpClient对头部进行检索，增加，删除，列出有关头部的内容*/
public class HTTPheads {

    public static void main(String[] args) {
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK,"OK");
        response.addHeader("Set-Cookie", "c1=a; path=/; domain=\"localhost\"");
        response.addHeader("Set-Cookie", "c2=b; path=\"/\", c3=c; domain=\"localhost\"");
        /*Header h1 = response.getFirstHeader("Set-Cookie");
        System.out.println(h1);
        Header h2 = response.getLastHeader("Set-Cookie");
        System.out.println(h2);
        Header[] headers = response.getHeaders("Set-Cookie");
        System.out.println(headers.length);*/

        /*获得所有的头部可以使用一种更有效的方式就是使用HeaderIterator*/
        //HeaderIterator headerIterator = response.headerIterator("Set-Cookie");

        /*while(headerIterator.hasNext()){
            System.out.println(headerIterator.next());
        }*/

        /*还提供了一种方便的方式用于将信息转换为头部元素*/
        HeaderElementIterator it = new BasicHeaderElementIterator(response.headerIterator("Set-Cookie"));

        while(it.hasNext()){
            HeaderElement element = it.nextElement();
            System.out.println(element.getName() + "=" + element.getValue());
            NameValuePair[] nameValuePair = element.getParameters();
            for(int i = 0;i < nameValuePair.length;i++){
                System.out.println(" " + nameValuePair[i]);
            }
        }


    }
}
