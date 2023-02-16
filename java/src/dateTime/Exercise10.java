package dateTime;

import java.time.Year;
import java.time.YearMonth;

public class Exercise10 {
    /*
     * 10 - Write a Java program to get the name of the first and last day of a month.
     */
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2023, 2);
        String firstDay = yearMonth.atDay(1).getDayOfWeek().name();
        String lastDay = yearMonth.atEndOfMonth().getDayOfWeek().name();
        System.out.println();
        System.out.println(firstDay);
        System.out.println(lastDay);
        System.out.println();
    }
}
