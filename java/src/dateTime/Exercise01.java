package dateTime;

import java.util.Calendar;

public class Exercise01 {
    /*
     * 1 - Write a Java program to create a Date object using the Calendar class.
     */
    public static void main(String[] args) {
        int year = 2023;
        int month = 2;
        int date = 15;

        Calendar cal = Calendar.getInstance();
        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

        System.out.println(cal.getTime());
        System.out.println();
    }
}