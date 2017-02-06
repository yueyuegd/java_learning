package generics;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
public class Manipulator<T extends HasF> {
    private T obj;
    public Manipulator(T x){
        obj = x;
    }
    public void manipulate(){
        obj.f();
    }
}
