package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
public class FourTurple<A,B,C,D> extends ThreeTurple<A,B,C>{
    public final D fourth;

    public FourTurple(A first, B second, C third, D fourth) {
        super(first, second, third);
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "FourTurple{" +"first=" + first +
                ", second=" + second +
                ",third=" + third+
                ",fourth=" + fourth +
                '}';
    }
}
