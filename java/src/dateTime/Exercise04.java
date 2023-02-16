package dateTime;

import java.util.Calendar;

public class Exercise04 {
    /*
     * 4 - Write a Java program to get the minimum value of year, month, week, date from the current date of a
     *       default calendar.
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println();
        System.out.println("\nCurrent Date and Time : " + cal.getTime());

        int actualMinYear = cal.getActualMinimum(Calendar.YEAR);
        int actualMinMonth = cal.getActualMinimum(Calendar.MONTH);
        int actualMinWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int actualMinDate = cal.getActualMinimum(Calendar.DATE);

        System.out.println("Actual Minimum Year: " + actualMinYear);
        System.out.println("Actual Minimum Month: " + actualMinMonth);
        System.out.println("Actual Minimum Week of Year: " + actualMinWeek);
        System.out.println("Actual Minimum Date: " + actualMinDate);
    }
}
