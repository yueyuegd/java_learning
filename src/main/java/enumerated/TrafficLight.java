package enumerated;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//在switch中使用enum是enum提供的一种便利的功能，一般来说
    //在switch中只能使用整数值，但是enum本来就具备整数值的次序，可以通过
    //ordinal()获得其次序
    enum Signal{
    GREEN,YELLOW,RED,
}
public class TrafficLight {
    Signal color = Signal.RED;
    public void change(){
        switch (color){
            case RED:color = Signal.GREEN;
                break;
            case GREEN:color = Signal.YELLOW;
                break;
            case YELLOW:color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for(int i = 0; i < 7; i++){
            System.out.println(t);
            t.change();
        }
    }
}
