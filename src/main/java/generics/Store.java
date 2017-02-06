package generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//使用泛型创建复杂模型  本例中构建的是一个零售店
//商店中的商品类
class Product{
    //每个商品特有的标识
    private long id;
    //该商品的描述
    private String description;
    //该商品的价格
    private double price;

    public Product() {
    }

    public Product(String description, double price, int id) {
        this.description = description;
        this.price = price;
        this.id = id;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
    public void priceChange(double change){
        price +=change;
    }
    //商品的生成器   随机生成商品的对象
    public static Generator<Product> generator =
            new Generator<Product>() {
                private Random random = new Random(47);
                public Product next() {
                    return new Product("test",Math.round(random.nextDouble()*1000.0)+0.99,random.nextInt(1000));
                }
            };
}
//货架类  构造方法的意思是对于每一个货架添加相应的商品
class Shelf extends ArrayList<Product>{
    public Shelf(int nProducts){
        Generators.fill(this,Product.generator,nProducts);
    }
}
//走廊类
//为走廊添加给定个数的货架   再添加相应数量的商品
class Aisle extends ArrayList<Shelf>{
    public Aisle(int nShelves,int nProducts){
        for(int i=0;i<nShelves;i++){
            add(new Shelf(nProducts));
        }
    }
}
//检验台类
class CheckoutStand{}
//办公室类
class Office{}

public class Store extends ArrayList<Aisle>{
    private ArrayList<CheckoutStand> checkoutStands =
            new ArrayList<CheckoutStand>();
    private Office office = new Office();
    public Store(int nAisle,int nShelves,int nProducts){
        for(int i=0;i<nAisle;i++){
            add(new Aisle(nShelves,nProducts));
        }
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Aisle a:this){
            for(Shelf s:a){
                for(Product p:s){
                    result.append(p);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14,5,10));
    }

}
