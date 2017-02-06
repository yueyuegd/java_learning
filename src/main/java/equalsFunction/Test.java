package equalsFunction;

/**
 * Created by zy on 2016/10/30.
 */
//测试类
//在覆盖equals方法时建议使用getClass方法来判断类型而不使用instanceof
public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee("kai",23);
        Employee e2 = new Employee("kai",17);
        Person p1 = new Person("kai");

        System.out.println(p1.equals(e1));
        System.out.println(p1.equals(e2));
        System.out.println(e1.equals(e2));
    }


}
