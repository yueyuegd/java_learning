package generics;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
//改写元祖工具
public class Tuple {
    public static <A,B> TwoTurple<A,B> tuple(A a,B b){
        return new TwoTurple<A, B>(a,b);
    }
    public static <A,B,C> ThreeTurple<A,B,C> tuple(A a,B b,C c){
        return new ThreeTurple<A, B, C>(a,b,c);
    }
    public static <A,B,C,D> FourTurple<A,B,C,D> tuple(A a,B b,C c,D d){
        return new FourTurple<A, B, C, D>(a,b,c,d);
    }
    public static <A,B,C,D,E> FiveTurple<A,B,C,D,E> tuple(A a,B b,C c,D d,E e){
        return new FiveTurple<A, B, C, D, E>(a,b,c,d,e);
    }
    public static <A,B,C,D,E,F> Sixturple<A,B,C,D,E,F> tuple(A a,B b,C c,D d,E e,F f){
        return new Sixturple<A, B, C, D, E, F>(a,b,c,d,e,f);
    }
}
