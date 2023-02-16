package dateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class Exercise05 {
    /*
     * 5 - Write a Java program to get the current time in New York.
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println();
        System.out.println("Time in New York : " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
                + cal.get(Calendar.SECOND));
        System.out.println();
    }
}
