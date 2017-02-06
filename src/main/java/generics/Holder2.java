package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
public class Holder2 {
    private Object obj;
    public Holder2(Object obj){
        this.obj=obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile automobile =(Automobile) holder2.getObj();
        holder2.setObj("not an Automobile");
        String s = (String)holder2.getObj();
        holder2.setObj(2);
        Integer i = (Integer)holder2.getObj();
    }
}
