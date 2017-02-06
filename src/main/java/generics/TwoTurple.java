package generics;

/**
 * Created by zhangyue_k on 2016/11/29.
 */
//元祖
public class TwoTurple<A,B> {
    public final A first;
    public final B second;

    public TwoTurple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoTurple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
