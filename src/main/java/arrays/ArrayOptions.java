package arrays;

import com.sun.jndi.ldap.Ber;

import java.util.Arrays;

/**
 * Created by zhangyue_k on 2016/12/9.
 */
public class ArrayOptions {
    public static void main(String[] args) {
        BerylliumSpere[] a;
        BerylliumSpere[] b = new BerylliumSpere[5];//不设置值的话就是放入null
        System.out.println("b:"+ Arrays.toString(b));
        BerylliumSpere[] c = new BerylliumSpere[4];
        for(int i=0;i<c.length;i++){
            if(c[i]==null){
                c[i] = new BerylliumSpere();
            }
        }
        BerylliumSpere[] d = {new BerylliumSpere(),new BerylliumSpere(),new BerylliumSpere()};
        a = new BerylliumSpere[]{new BerylliumSpere(),new BerylliumSpere()};
        System.out.println("a.length:"+a.length);
        System.out.println("b.length:"+b.length);
        System.out.println("c.length:"+c.length);
        System.out.println("d.length:"+d.length);
        a = d;
        System.out.println("a.length:"+a.length);

        int[] e;
        int[] f = new int[5];//基本类型的数组默认值是0
        System.out.println("f:"+Arrays.toString(f));
        int[] g = new int[4];
        for(int i=0;i<g.length;i++){
            g[i] = i*i;
        }
        int[] h ={11,47,93};
        System.out.println("f.length:"+f.length);
        System.out.println("g.length:"+g.length);
        System.out.println("h.length:"+h.length);
        e = h;
        System.out.println("e.length:"+e.length);
        e = new int[]{1,2};
        System.out.println("e.length:"+e.length);

    }
}
