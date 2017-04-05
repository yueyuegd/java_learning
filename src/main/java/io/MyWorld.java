package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyue-k on 2017/4/5.
 * User:zhangyue-k
 * Date:2017/4/5
 */
/*  存储程序的一些状态，以便我们随后可以很容易的将程序恢复到当前状态*/

class House implements Serializable{

}
class Animal implements Serializable{
    private String name;
    private House preferredHouse;

    public Animal(String name, House preferredHouse) {
        this.name = name;
        this.preferredHouse = preferredHouse;
    }

    @Override
    public String toString() {
        return name + "[" + super.toString() + "]," + preferredHouse + "\n";
    }
}
public class MyWorld {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        House house = new House();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Bosoc the dog", house));
        animals.add(new Animal("Ralph the hamster", house));
        animals.add(new Animal("Molly the cat", house));
        System.out.println("animals:" + animals);
        ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
        ObjectOutputStream o1 = new ObjectOutputStream(buf1);
        o1.writeObject(animals);
        o1.writeObject(animals);

        ByteArrayOutputStream buf2 = new ByteArrayOutputStream();
        ObjectOutputStream o2 = new ObjectOutputStream(buf2);
        o2.writeObject(animals);

        ObjectInputStream in1 = new ObjectInputStream(
                new ByteArrayInputStream(buf1.toByteArray())
        );

        ObjectInputStream in2 = new ObjectInputStream(
                new ByteArrayInputStream(buf2.toByteArray())
        );

        List animals1 = (List) in1.readObject(), animals2 = (List) in1.readObject(), animals3 = (List) in2.readObject();

        System.out.println("animals1:" + animals + "\n" + "animal2:" + animals2 + "\n" + "animals3:" + animals3);


    }

}
