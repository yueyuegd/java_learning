package io.xml;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Elements;

import java.util.ArrayList;

/**
 * Created by zhangyue-k on 2017/4/5.
 * User:zhangyue-k
 * Date:2017/4/5
 */
/* 从XML文件中反序列化成对象*/
public class People extends ArrayList<Person> {

    public People(String fileName) throws Exception{

        Document doc = new Builder().build(fileName);
        Elements elements = doc.getRootElement().getChildElements();
        for(int i = 0;i < elements.size();i++){
            add(new Person(elements.get(i)));
        }


    }

    public static void main(String[] args) throws Exception{
        People p = new People("people.xml");
        System.out.println(p);
    }
}
