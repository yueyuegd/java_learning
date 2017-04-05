package io;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * Created by zhangyue-k on 2017/3/28.
 * User:zhangyue-k
 * Date:2017/3/28
 */
//使用IntBuffer操作ByteBuffer中的int型数据
public class IntBufferDemo {

    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        IntBuffer ib = bb.asIntBuffer();
        ib.put(new int[]{11,42,47,99,143,811,1016});
        System.out.println(ib.get(3));
        ib.put(3,1811);
        ib.flip();
        while (ib.hasRemaining()){
            int i = ib.get();
            System.out.println(i);
        }
    }
}
