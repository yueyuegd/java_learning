package temp;

import java.time.LocalDateTime;

/**
 * Created by zhangyue_k on 2016/12/5.
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        System.out.println(time.toString().split("T")[0]);
    }
}
