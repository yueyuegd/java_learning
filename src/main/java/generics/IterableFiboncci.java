package generics;

import java.util.Iterator;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
//如果想要Fibonacci实现Iterable接口的话一种方法是重写该类
//这种方式比较麻烦  可以使用适配器设计模式   就是创建一个适配器来实现所需要的接口
public class IterableFiboncci extends Fibonacci implements Iterable<Integer>{
    private int n;

    public IterableFiboncci(int n) {
        this.n = n;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n>0;
            }

            public Integer next() {
                n--;
                return IterableFiboncci.this.next();
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i:new IterableFiboncci(18)){
            System.out.print(i+" ");
        }
    }
}
