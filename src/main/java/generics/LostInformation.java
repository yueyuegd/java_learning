package generics;

import java.util.*;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//
class Forb{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSITION,MOMENTUM>{}
public class LostInformation {

    public static void main(String[] args) {
        List<Forb> list = new ArrayList<Forb>();
        Map<Forb,Fnorkle> map = new HashMap<Forb, Fnorkle>();
        Quark<Fnorkle> quark = new Quark<Fnorkle>();
        Particle<Long,Double> p = new Particle<Long, Double>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
        List<String> stringList = new ArrayList<String>();
        System.out.println(stringList.getClass().getTypeParameters().toString());
    }
}
