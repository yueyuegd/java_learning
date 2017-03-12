package containers;

import java.util.Random;

/**
 * Created by zhangyue-k on 2017/3/12.
 * User:zhangyue-k
 * Date:2017/3/12
 */
public class Prediction {

    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble() > 0.5;

    @Override
    public String toString() {
        if(shadow){
            return "Six more weeks of Winter!";
        }
        else{
            return "Early Spring!";
        }

    }
}
