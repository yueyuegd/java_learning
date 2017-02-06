package generics;

import java.util.*;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//泛型还可以使用在匿名内部类和内部类中

class Customer{
    private static long counter = 1;
    private final long id = counter++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }

    public static Generator<Customer> generator(){
        return new Generator<Customer>() {
            public Customer next() {
                return new Customer();
            }
        };
    }


}
class Teller{
    private static long counter = 1;
    private final long id = counter++;

    private Teller() {
    }

    @Override
    public String toString() {
        return "Teller{" +
                "id=" + id +
                '}';
    }
    public static Generator<Teller> generator = new Generator<Teller>() {
        public Teller next() {
            return new Teller();
        }
    };
}
public class BankTeller {
    public static void serve(Teller teller,Customer customer){
        System.out.println("teller:"+teller+"serves customer:"+customer);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line,Customer.generator(),15);
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers,Teller.generator,4);
        for(Customer c:line){
            serve(tellers.get(random.nextInt(tellers.size())),c);
        }
    }

}
