package containers;

/**
 * Created by zhangyue-k on 2017/3/15.
 * User:zhangyue-k
 * Date:2017/3/15
 */
/*  这是一个与Math.random()相关的实例  一般认为这个方法产生的是0到1的值
但是到底0和1分别是包不包括在内的是要验证的*/
public class RandomBounds {

    static void usage(){
        System.out.print("Usage: ");
        System.out.print("\tRandomBounds lower");
        System.out.print("\tRandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args){
        if(args.length != 1){
            usage();
        }
        if(args[0].equals("lower")){
            while(Math.random() != 0.0){
                ;
            }
            System.out.print("Produced 0.0!");
        }else if(args[0].equals("upper")){
            while(Math.random() != 1.0){
                ;
            }
            System.out.print("Produced 1.0!");
        }else{
            usage();
        }
    }
}
