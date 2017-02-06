package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
public class ThreeTurple<A,B,C> extends TwoTurple<A,B>{
    public final C third;

    public ThreeTurple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "ThreeTurple{" +"first=" + first +
                ", second=" + second +
                "third=" + third +
                '}';
    }
}
