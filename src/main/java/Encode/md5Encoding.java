package Encode;

import java.security.MessageDigest;

/**
 * Created by zhangyue-k on 2017/4/27.
 * User:zhangyue-k
 * Date:2017/4/27
 */
//给一个字符串进行MD5加密   加密之后都是小写的字母   258f27f0bb7c5afe8378b412db7870cd
public class md5Encoding {

    public static void main(String[] args) {

        String encodingStr = md5("52houbank");
        String MDencodingStr = MD5Encode("52houbank");
        System.out.println("第一次经过MD5加密之后得到的字符串:" + encodingStr);
        System.out.println("第一次经过MD5加密之后得到的字符串:" + MDencodingStr);
    }

    public final static  String byte2hexString(byte[] bytes) {
        StringBuffer bf = new StringBuffer(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            if ((bytes[i] & 0xff) < 0x10) {
                bf.append("0");
            }
            bf.append(Long.toString(bytes[i] & 0xff, 16));
        }
        return bf.toString();
    }

    public static String MD5Encode(String sourceString) {
        String resultString = null;
        try {
            resultString = new String(sourceString);
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byte2hexString(md.digest(resultString.getBytes()));
        } catch (Exception ex) {
        }
        return resultString;
    }

    public static String md5(String str){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] b = md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < b.length; i++) {
                int v = (int) b[i];
                v = v < 0 ? 0x100 + v : v;
                String cc = Integer.toHexString(v);
                if (cc.length() == 1)
                    sb.append('0');
                sb.append(cc);
            }
            return sb.toString();
        }
        catch (Exception e) {
        }
        return "";
    }
}
