package dateTime;

import java.util.Calendar;

public class Exercise08 {
    /*
     * 8 - Write a Java program to get the last date of the month.
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getTime());
        System.out.println();
    }
}