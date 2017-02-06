package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//遵循BankTeller.java的原则，创建一个Ocean让BigFish吃LittleFish
//定义BigFish
class BigFish{
    private static long counter = 1;
    private final long id = counter++;

    private BigFish() {
    }

    @Override
    public String toString() {
        return "BigFish{" +
                "id=" + id +
                '}';
    }

    //生成器
    public static Generator<BigFish> generator(){
        return new Generator<BigFish>() {
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}
class LittleFish{
    private static long counter = 1;
    private final long id = counter++;

    private LittleFish() {
    }

    @Override
    public String toString() {
        return "LittleFish{" +
                "id=" + id +
                '}';
    }
    //生成器
    public static Generator<LittleFish> generator(){
        return new Generator<LittleFish>() {
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}
public class Ocean {
    public static void eat(BigFish bigFish,LittleFish littleFish){
        System.out.println(bigFish+" eat "+littleFish);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        List<BigFish> bigFishs = new ArrayList<BigFish>();
        Generators.fill(bigFishs,BigFish.generator(),5);
        List<LittleFish> littleFishs = new ArrayList<LittleFish>();
        Generators.fill(littleFishs,LittleFish.generator(),10);
        for(LittleFish littleFish:littleFishs){
            eat(bigFishs.get(random.nextInt(bigFishs.size())),littleFish);
        }

    }


}
