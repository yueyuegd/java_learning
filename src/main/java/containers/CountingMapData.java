package containers;

import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhangyue-k on 2017/2/8.
 */
//经过初始化并且都是唯一的Integer和String的Map，可以具有任意的尺寸
public class CountingMapData extends AbstractMap<Integer,String>{

    private int size;
    private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");

    public CountingMapData(int size) {
        if(this.size  < 0){
            this.size = 0;
        }else{
            this.size = size;
        }
    }

    private static class Entry implements Map.Entry<Integer,String>{
        int index;

        public Entry(int index) {
            this.index = index;
        }

        @Override
        public boolean equals(Object o) {
            return Integer.valueOf(index).equals(o);
        }

        public Integer getKey(){
            return index;
        }

        public String getValue(){
            return chars[index%chars.length] + Integer.toString(index/chars.length);
        }

        public String setValue(String value){
            throw new UnsupportedOperationException();
        }

        @Override
        public int hashCode() {
            return Integer.valueOf(index).hashCode();
        }
    }

    @Override
    public Set<Map.Entry<Integer, String>> entrySet() {
        Set<Map.Entry<Integer,String>> entries = new LinkedHashSet<Map.Entry<Integer, String>>();
        for(int i = 0;i < size;i++){
            entries.add(new Entry(i));
        }
        return entries;
    }

    public static void main(String[] args) {
        System.out.println(new CountingMapData(60));
    }
}
