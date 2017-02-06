package generics;

import java.util.Date;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
public class TupleTest2 {
    static TwoTurple<String,Integer> f(){
        return Tuple.tuple("hi",4);
    }
    static TwoTurple f2(){
        return Tuple.tuple("hi",4);
    }
    static ThreeTurple<Amphibian,String,Integer> g(){
        return Tuple.tuple(new Amphibian(),"hi",47);
    }
    static FourTurple<Vehicle,Amphibian,String,Integer> h(){
        return Tuple.tuple(new Vehicle(),new Amphibian(),"hi",47);
    }
    static FiveTurple<Vehicle,Amphibian,String,Integer,Double> k(){
        return Tuple.tuple(new Vehicle(),new Amphibian(),"hi",47,11.2);
    }
    static Sixturple<Vehicle,Amphibian,String,Integer,Float,Character> l(){
        return Tuple.tuple(new Vehicle(),new Amphibian(),"hi",1,1.1F,'k');
    }

    public static void main(String[] args) {
        TwoTurple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(l());
    }
}
