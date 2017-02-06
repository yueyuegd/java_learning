package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
//为了使用元祖,只需要定义一个长度适合的元祖,将其作为return的返回值,然后在return语句中创建该元祖并返回
class Amphibian{}
class Vehicle{}
public class testTuple {
    static TwoTurple<String,Integer> f(){
        return new TwoTurple<String, Integer>("hi",17);
    }
    static ThreeTurple<Amphibian,String,Integer> g(){
        return new ThreeTurple<Amphibian, String, Integer>(new Amphibian(),"hi",17);
    }
    static FourTurple<Vehicle,Amphibian,String,Integer> h(){
        return new FourTurple<Vehicle, Amphibian, String, Integer>(new Vehicle(),new Amphibian(),"hi",17);
    }
    static FiveTurple<Vehicle,Amphibian,String,Integer,Double> k(){
        return new FiveTurple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(),new Amphibian(),"hi",17,11.1);
    }

    public static void main(String[] args) {
        TwoTurple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }

}
