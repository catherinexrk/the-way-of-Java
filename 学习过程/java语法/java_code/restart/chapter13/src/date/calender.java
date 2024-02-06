package date;

import java.util.Calendar;

public class calender {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        System.out.println(date);

        System.out.println(date.getWeekYear());
        System.out.println(date.get(Calendar.YEAR));

        System.out.println(date.get(Calendar.MONDAY)+1);
        System.out.println(date.get(Calendar.HOUR));

    }
}
