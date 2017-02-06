package ArrayIntro;

/**
 * Created by zy on 2016/10/31.
 */
public class TestEx {

    public static void main(String[] args) {
        int[] arrays_01 = new int[10];
        System.out.println("一维数组的类名是:"+arrays_01.getClass().getName());

        int[][] arrays_02 = new int[10][10];
        System.out.println("二维数组的类名是:"+arrays_02.getClass().getName());

        int[][][] arrays_03 = new int[10][10][10];
        System.out.println("三维数组的类名是:"+arrays_03.getClass().getName());

        long[] arrays_04 = new long[10];
        System.out.println("long类型的一维数组的类名是:"+arrays_04.getClass().getName());
    }
}
