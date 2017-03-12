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
public class CountedString {

    private static List<String> created = new ArrayList<String>();
    private String s;
    private int id = 0;

    public CountedString(String str) {
        this.s = str;
        created.add(s);
        for(String s2:created){
            if(s2.equals(s)){
                id++;
            }
        }
    }

    @Override
    public String toString() {
        return "String: " + s +" id: " + id +" hashCode(): " + hashCode();

    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CountedString && s.equals(((CountedString)o).s) &&
                id == ((CountedString)o).id;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    public static void main(String[] args) {
        Map<CountedString,Integer> map = new HashMap<CountedString, Integer>();
        CountedString[] cs = new CountedString[5];
        for(int i = 0;i < cs.length;i++){
            cs[i] = new CountedString("hi");
            map.put(cs[i],i);
        }
        System.out.println(map);
        for(CountedString countedString:cs){
            System.out.println("Looking up: " + countedString);
            System.out.println(map.get(countedString));
        }
    }
}
