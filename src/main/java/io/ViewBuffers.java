package io;

import java.nio.*;

/**
 * Created by zhangyue-k on 2017/3/28.
 * User:zhangyue-k
 * Date:2017/3/28
 */
//通过在同一个ByteBuffer上建立不同的试图缓冲器
// 将同一字节序列翻译成short，int，float，long和double类型的数据
public class ViewBuffers {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[]{0,0,0,0,0,0,0,'a'});
        bb.rewind();
        System.out.println("Byte Buffer ");
        while(bb.hasRemaining()){
            System.out.print(bb.position() + "->" + bb.get() + ",");
        }
        System.out.println();

        CharBuffer cb = ((ByteBuffer)(bb.rewind())).asCharBuffer();
        System.out.println("Char buffer ");
        while(cb.hasRemaining()){
            System.out.print(cb.position() + "->" + cb.get() + ",");
        }
        System.out.println();

        FloatBuffer fb = ((ByteBuffer)(bb.rewind())).asFloatBuffer();
        System.out.println("Float Buffer ");
        while(fb.hasRemaining()){
            System.out.print(fb.position() + "->" + fb.get() + ",");
        }
        System.out.println();

        IntBuffer ib = ((ByteBuffer)(bb.rewind())).asIntBuffer();
        System.out.println("Int Buffer ");
        while(ib.hasRemaining()){
            System.out.print(ib.position() + "->" +ib.get() + ",");
        }
        System.out.println();

        LongBuffer lb = ((ByteBuffer)(bb.rewind())).asLongBuffer();
        System.out.println("Long Buffer ");
        while (lb.hasRemaining()){
            System.out.print(lb.position() + "->" + lb.get() + ",");
        }
        System.out.println();

        ShortBuffer sb = ((ByteBuffer)bb.rewind()).asShortBuffer();
        System.out.println("Short Buffer ");
        while(sb.hasRemaining()){
            System.out.print(sb.position() + "->" + sb.get() + ",");
        }
        System.out.println();

        DoubleBuffer db = ((ByteBuffer)(bb.rewind())).asDoubleBuffer();
        System.out.println("Double Buffer ");
        while(db.hasRemaining()){
            System.out.print(db.position() + "->" + db.get() + ",");
        }
    }
}
