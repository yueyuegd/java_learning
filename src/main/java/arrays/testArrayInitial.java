package arrays;

/**
 * Created by zhangyue_k on 2016/12/9.
 */
//
public class testArrayInitial {

    //一个参数为数组的方法
    public static void acceptArrayArg(final BerylliumSpere[] berylliumSperes){
        System.out.println("berylliumSperes.length:" + berylliumSperes.length);
        for (int i = 0;i < berylliumSperes.length; i++){
            System.out.print(berylliumSperes[i]+ " ");
        }
    }

    public static void main(final String[] args) {
        //动态创建数组作为参数
        System.out.println("动态创建数组作为参数");
        acceptArrayArg(new BerylliumSpere[]{new BerylliumSpere(), new BerylliumSpere()});
        System.out.println();
        System.out.println("普通的聚集数组初始化得到的数组作为参数");
        BerylliumSpere[] c = new BerylliumSpere[4];
        for (int i = 0; i < c.length; i++){
            if (c[i] == null){
                c[i] = new BerylliumSpere();
            }
        }
        acceptArrayArg(c);
        //使用普通的聚集数组初始化不能有效
        /*BerylliumSpere[] arrays = new BerylliumSpere[]{new BerylliumSpere(), new BerylliumSpere()};
        acceptArrayArg(arrays);*/
    }
}
