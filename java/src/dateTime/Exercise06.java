package dateTime;

import java.util.Calendar;

public class Exercise06 {
    /*
     * 6 - Write a Java program to get current full date and time.
     */
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println();
        System.out.println("Current full date and time is : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
                + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
                + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));
        System.out.println();
    }
}
