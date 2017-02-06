package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
class Automobile{}
public class Holder1 {
    private Automobile a;
    public Holder1(Automobile a){
        this.a=a;
    }
    Automobile get(){
        return this.a;
    }
}
