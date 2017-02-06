package arrays;

/**
 * Created by zhangyue_k on 2016/12/11.
 */
//定义一个方法返回的是入参的尺寸
public class SizeArray {

    public static int sizeOfArray(BerylliumSpere[] berylliumSperes){
        int length;
        length = berylliumSperes.length;
        System.out.println("berylliumSperes.length:"+length);
        return length;


    }

    public static void main(final String[] args) {
        BerylliumSpere[] a = new BerylliumSpere[]{
                new BerylliumSpere(), new BerylliumSpere(), new BerylliumSpere()
        };
        sizeOfArray(a);
    }

}
