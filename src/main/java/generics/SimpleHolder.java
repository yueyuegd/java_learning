package generics;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
public class SimpleHolder {
    private Object object;
    public void set(Object obj){
        object=obj;
    }
    public Object get(){
        return object;
    }

    public static void main(String[] args) {
        SimpleHolder simpleHolder = new SimpleHolder();
        simpleHolder.set("Item");
        String s =(String) simpleHolder.get();
    }
}
