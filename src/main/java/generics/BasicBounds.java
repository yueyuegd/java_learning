package generics;

import java.awt.*;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//边界的基本要素
//泛型重用了extends关键字  该关键字在泛型边界上下文环境中和普通情况下意义是不一样的
//有冗余的情况
interface HasColor {
    Color getColor();
}
class Colored<T extends HasColor>{
    T item;

    Colored(T item) {
        this.item = item;
    }
    T getItem(){
        return item;
    }
    Color color(){
        return item.getColor();
    }
}
class Dimension{
    public int x,y,z;
}
//可以加入多个边界
class ColoredDimension<T extends Dimension&HasColor>{
    T item;

    ColoredDimension(T item) {
        this.item=item;
    }
    T getItem(){
        return item;
    }
    Color color(){
        return item.getColor();
    }
    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }
}
interface Weight{
    int weight();
}
//加入边界有类还有借口的时候  先是类再是接口
class Solid<T extends Dimension&HasColor&Weight>{
    T item;

    Solid(T item) {
        this.item = item;
    }
    T getItem(){
        return item;
    }
    Color color(){
        return item.getColor();
    }
    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }
    int weight(){
        return item.weight();
    }
}
class Bounded extends Dimension implements HasColor,Weight{
    public Color getColor(){
        return Color.blue;
    }
    public int weight(){
        return 176;
    }
}
public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
        solid.color();
        System.out.println(solid.color());
        solid.getX();
        System.out.println(solid.getX());
        solid.weight();
        System.out.println(solid.weight());
    }

}
