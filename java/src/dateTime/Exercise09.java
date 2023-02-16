package dateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercise09 {
    /*
     * 9 - Write a Java program to calculate the first and last day of each week.
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println();

        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(dateFormat.format(cal.getTime()));

        for (int i = 0; i < 6; i++) {
            cal.add(Calendar.DATE, 1);
        }

        System.out.println(dateFormat.format(cal.getTime()));
        System.out.println();
    }
}
