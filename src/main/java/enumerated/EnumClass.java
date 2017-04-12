package enumerated;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//用于演示Enum提供的一些功能
    enum Shrubbery{
    GROUND, CRAWLING, HANGING
}
public class EnumClass {
    public static void main(String[] args) {
        for(Shrubbery s:Shrubbery.values()){
            //ordinal()是指每个enum实例在声明时的次序  从零开始，可以使用==来比较enum实例
            System.out.println(s + " ordinal: " + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.println(s.equals(Shrubbery.CRAWLING) + " ");
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("-----------------------");
        }

        for(String s:"HANGING CRAWLING GROUND".split(" ")){
            Shrubbery shrub = Enum.valueOf(Shrubbery.class,s);
            System.out.println(shrub);
        }
    }

}
