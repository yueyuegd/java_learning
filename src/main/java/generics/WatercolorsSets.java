package generics;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by zhangyue_k on 2016/12/6.
 */
public class WatercolorsSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED,Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE,Watercolors.BURNT_UMBER);
        System.out.println("set1:"+set1);
        System.out.println("set2:"+set2);
        //得到两个集合的并集
        System.out.println("union(set1,set2):"+Sets.union(set1,set2));
        Set<Watercolors> subSet = Sets.intersection(set1,set2);
        System.out.println("intersection(set1,set2):"+subSet);
        System.out.println("difference(set1,subset):"+Sets.difference(set1,subSet));
        System.out.println("difference(set2,subset):"+Sets.difference(set2,subSet));
        System.out.println("complement(set1,set2)"+Sets.complement(set1,set2));

    }
}
