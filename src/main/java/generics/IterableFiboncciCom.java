package generics;

import java.util.Iterator;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
//来利用组合的方式而不使用继承  使Fiboncci成为Iterable
public class IterableFiboncciCom implements Iterable<Integer>{

    private Fibonacci fibonacci = new Fibonacci();
    private int n;

    public IterableFiboncciCom(int n) {
        this.n = n;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n>0;
            }

            public Integer next() {
                n--;
                return fibonacci.next();
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };

    }

    public static void main(String[] args) {
        for(int i:new IterableFiboncciCom(18)){
            System.out.print(i+" ");
        }
    }

}
