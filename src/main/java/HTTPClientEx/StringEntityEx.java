package HTTPClientEx;

import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by zhangyue-k on 2017/3/9.
 * User:zhangyue-k
 * Date:2017/3/9
 */
/*  使用EntityUtils工具类来获得调用接口之后的Entity解析   会直接返回一个字符串*/
public class StringEntityEx {

    public static void main(String[] args) {

        StringEntity stringEntity = new StringEntity("import message",
                ContentType.create("text/plain", "UTF-8"));

        System.out.println(stringEntity.getContentType());
        System.out.println(stringEntity.getContentLength());
        HttpEntity httpEntity = null;
        try {
            System.out.println(EntityUtils.toString(stringEntity));
            System.out.println(EntityUtils.toByteArray(stringEntity).length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
