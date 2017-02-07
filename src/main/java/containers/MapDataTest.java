package containers;

import generics.Generator;
import net.maindview.util.CountingGenerator;
import net.maindview.util.Pair;
import net.maindview.util.RandomGenerator;

import java.util.Iterator;

/**
 * Created by zhangyue-k on 2017/2/6.
 */

class Letters implements Generator<Pair<Integer,String>>,Iterable<Integer>{

    private int size = 9;
    private int number = 1;
    private char letter = 'A';
    public Pair<Integer,String> next(){
        return new Pair<Integer, String>(number++,""+letter++);
    }

    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return number < size;
            }

            public Integer next() {
                return number++;
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }



}
public class MapDataTest {

    public static void main(String[] args) {
        System.out.println(MapData.map(new Letters(),11));
        System.out.println(MapData.map(new CountingGenerator.Character(),"Value",6));
        System.out.println(MapData.map(new Letters(),new RandomGenerator.String(3)));
        System.out.println(MapData.map(new Letters(),"Pop"));
    }


}
