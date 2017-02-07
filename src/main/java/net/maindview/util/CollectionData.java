package net.maindview.util;

import generics.Generator;

import java.util.ArrayList;

/**
 * Created by zhangyue-k on 2017/2/6.
 */
//泛型类
public class CollectionData<T> extends ArrayList<T> {

    public CollectionData(Generator<T> gen,int quantity){
        for(int i = 0;i < quantity; i++){
            this.add(gen.next());
        }

    }

    //泛型方法
    public static <T> CollectionData<T> list(Generator<T> gen,int quantity){
        return new CollectionData<T>(gen,quantity);
    }
}
