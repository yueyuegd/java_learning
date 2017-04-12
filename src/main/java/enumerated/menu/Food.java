package enumerated.menu;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
public interface Food {

    enum Appletizer implements Food{
        SALAD,SOUP,SPRING_ROLLS
    }
    enum MainCourse implements Food{
        LASAGNE,BURRITO,PAD_THAI,LENTILS,HUMMOUS,VINDALOO
    }
    enum Dessert implements Food{
        TIRAMISU,GELATO,BLACK_FOREST_CAKE,FRUIT,CREAM_CARAMEL
    }
    enum Coffe implements Food{
        BLACK_COFFEE,DECAF_COFFEE,ESPRESSO,LATTE,CAPPUCCINO,TEA,HERB_TEA
    }
}
