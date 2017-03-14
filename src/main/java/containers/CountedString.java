package containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangyue-k on 2017/3/12.
 * User:zhangyue-k
 * Date:2017/3/12
 */
/*应用Effective Java一书中对hashCode()的基本指导给出的实例*/
/*  练习26:在CountedString中加入一个char域,他也在构造器中初始化,然后修改hashCode()和equals()方法,使他们都包含这个char域的值*/
public class CountedString {

    private static List<String> created = new ArrayList<String>();
    private String s;
    private int id = 0;
    private char c;

    public CountedString(String str,char c) {
        this.s = str;
        this.c = c;
        created.add(s);
        for(String s2:created){
            if(s2.equals(s)){
                id++;
            }
        }
    }

    @Override
    public String toString() {
        return "String: " + s + " id: " + id + " c: " + c + " hashCode(): " + hashCode();

    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CountedString && s.equals(((CountedString)o).s) &&
                id == ((CountedString)o).id && (int)c == (int)(((CountedString)o).c);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        result = 37 * result + c;
        return result;
    }

    public static void main(String[] args) {
        Map<CountedString, Integer> map = new HashMap<CountedString, Integer>();
        CountedString[] cs = new CountedString[5];
        for(int i = 0;i < cs.length;i++){
            cs[i] = new CountedString("hi", 'k');
            map.put(cs[i],i);
        }
        System.out.println(map);
        for(CountedString countedString:cs){
            System.out.println("Looking up: " + countedString);
            System.out.println(map.get(countedString));
        }
    }
}
