package enumerated.cartoons;

import generics.Generator;

import java.util.Random;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//我们不可以继承enum但是可以通过实现的方式来使之实现一个或者是多个接口

    enum CartoonCharacter implements Generator<CartoonCharacter>{
    SLAPPY,SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;
    private Random rand = new Random(47);
    public CartoonCharacter next(){
        return values()[rand.nextIn t(values().length)];
}

}
public class EnumImplemention {
    public static <T> void printNext(Generator<T> rg){
        System.out.print(rg.next() + ",");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for(int i = 0; i < 10; i++){
            printNext(cc);
        }
    }
}
