package enumerated;

import io.OSExecute;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//对于values()方法
    //因为enum继承于Enum，但是Enum中并没有定义values()方法

    enum Explore{
    HERE,THERE,
}
public class Reflection {

    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("----- Analyzing " + enumClass + "-----");
        System.out.println("Interfaces:");
        for(Type t:enumClass.getGenericInterfaces()){
            System.out.println(t);
        }
        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<String>();
        for(Method m:enumClass.getMethods()){
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("Explore.containsAll(Enum)?" + exploreMethods.containsAll(enumMethods));
        System.out.println("Explore.removeAll(Enum):");
        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);
        //OSExecute.command("javap Explore");
    }
}
