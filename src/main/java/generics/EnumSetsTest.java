package generics;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//测试EnumSets的功能
public class EnumSetsTest {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED,Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE,Watercolors.BURNT_UMBER);
        System.out.println("union(set1,set2):"+EnumSets.union(set1,set2));
    }
}
