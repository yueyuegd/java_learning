package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
public class FiveTurple<A,B,C,D,E> extends FourTurple<A,B,C,D> {
    public final E fifth;

    public FiveTurple(A first, B second, C third, D fourth, E fifth) {
        super(first, second, third, fourth);
        this.fifth = fifth;
    }

    @Override
    public String toString() {
        return "FiveTurple{" +"first=" + first +
                ", second=" + second +
                ",third=" + third+
                ",fourth=" + fourth +
                ",fifth=" + fifth +
                '}';
    }
}
