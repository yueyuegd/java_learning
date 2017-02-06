package generics;

import java.util.ArrayList;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//创建list元祖
public class TupleList<A,B,C,D> extends ArrayList<FourTurple<A,B,C,D>>{
    public static void main(String[] args) {
        TupleList<Vehicle,Amphibian,String,Integer> tl = new TupleList<Vehicle, Amphibian, String, Integer>();
        tl.add(TupleTest2.h());
        tl.add(TupleTest2.h());
        for(FourTurple<Vehicle,Amphibian,String,Integer> i:tl){
            System.out.println(i);
        }
    }
}
