package temp;

import sun.util.calendar.BaseCalendar;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by zhangyue_k on 2016/11/30.
 */
public class LocalDataTest {

    public static void main(String[] args) {
        LocalDate time = LocalDate.now();
        System.out.println(time+"/");
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getYear());

    }

}
