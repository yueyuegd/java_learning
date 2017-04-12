package enumerated.menu;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
public class Meal {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(Course course:Course.values()){
                Food food = course.randomSelection();
                System.out.println(food);
            }
            System.out.println("----");
        }
    }
}
