package enumerated.menu;

import utils.Enums;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
public enum Course {

    APPETIZER(Food.Appletizer.class),
    MAINCOURCE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffe.class);

    private Food[] values;

    Course(Class<? extends Food> kind) {
        this.values = kind.getEnumConstants();
    }

    public Food randomSelection(){
        return Enums.random(values);
    }
}
