package utils;

import java.util.Map;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
public class testMapNotType {

    public static boolean f(Map<Integer,String> mapType){
        System.out.println(f(New.<Integer, String>map()));
        return true;
    }

    public static void main(String[] args) {
        //testMapNotType.f(New.<Integer, String>map());
    }
}
