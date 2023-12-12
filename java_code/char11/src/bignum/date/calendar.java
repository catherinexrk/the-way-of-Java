package bignum.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author 陶笛
 */
public class calendar{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//创建日历对象
        System.out.println("=====================");
        System.out.println("year = " + c.get(Calendar.YEAR));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("year = " + localDateTime.getYear());
    }
}
