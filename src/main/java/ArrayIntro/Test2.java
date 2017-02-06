package ArrayIntro;

import java.util.Arrays;

/**
 * Created by zy on 2016/10/31.
 */
//数组复制问题
public class Test2 {
    public static void main(String[] args) {
        Person person_01 = new Person("kai");
        Person[] person1 = new Person[]{person_01};
        Person[] person2 = Arrays.copyOf(person1,person1.length);
        System.out.println("数组person1:");
        display(person1);
        System.out.println("=============");
        System.out.println("数组person2:");
        display(person2);
        //改变其值
        person2[0].setName("wjk");
        System.out.println("=====改变其值后=====");
        System.out.println("数组person1:");
        display(person1);
        System.out.println("=============");
        System.out.println("数组person2:");
        display(person2);

    }

    public static void display(Person[] persons){
        for(Person person:persons){
            System.out.println(person.toString());
        }
    }
}
