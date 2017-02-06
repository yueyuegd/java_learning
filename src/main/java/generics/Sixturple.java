package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
public class Sixturple<A,B,C,D,E,F> extends FiveTurple<A,B,C,D,E> {
    public final F sixth;

    public Sixturple(A first, B second, C third, D fourth, E fifth, F sixth) {
        super(first, second, third, fourth, fifth);
        this.sixth = sixth;
    }

    @Override
    public String toString() {
        return "Sixturple{" +"first=" + first +
                ",second=" + second +
                ",third=" + third+
                ",fourth=" + fourth +
                ",fifth=" + fifth+
                ",sixth=" + sixth +
                '}';
    }
}
