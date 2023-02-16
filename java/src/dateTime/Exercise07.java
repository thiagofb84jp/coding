package dateTime;

import java.util.Calendar;

public class Exercise07 {
    /*
     * 7 - Write a Java program to get the last day of the current month.
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println();
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println();
    }
}
