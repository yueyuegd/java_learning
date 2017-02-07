package containers;

import net.maindview.util.CollectionData;
import net.maindview.util.RandomGenerator;


import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by zhangyue-k on 2017/2/6.
 */
public class CollectionDataGenerator {

    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(9),10)));
        System.out.println(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(),10)));
    }
}
