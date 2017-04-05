package io;

import java.nio.ByteBuffer;

/**
 * Created by zhangyue-k on 2017/3/28.
 * User:zhangyue-k
 * Date:2017/3/28
 */
//尽管ByteBuffer只能保存字节类型的数据
    //但是他可以从这些字节中产生各种不同基本类型的值
public class GetData {

    private static final int BSIZE = 1024;
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        int i = 0;
        while(i++ < bb.limit()){
            if(bb.get() != 0){
                System.out.println("nonsero");
            }

        }
        System.out.println("i = " + i );
        bb.rewind();
        bb.asCharBuffer().put("Howdy!");
        char c;
        while((c = bb.getChar())!= 0){
            System.out.print(c + " ");
        }
        System.out.println();
        bb.rewind();
        bb.asShortBuffer().put((short) 471142);
        System.out.println(bb.getShort());
        bb.rewind();
        bb.asLongBuffer().put(99471142);
        System.out.println(bb.getLong());
        bb.rewind();
        bb.asFloatBuffer().put(99471142);
        System.out.println(bb.getFloat());
        bb.rewind();
        bb.asDoubleBuffer().put(99471142);
        System.out.println(bb.getDouble());
        bb.rewind();
    }
}
