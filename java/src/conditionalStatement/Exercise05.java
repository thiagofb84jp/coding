package conditionalStatement;

import java.util.Scanner;

public class Exercise05 {
    /*
     * 5 - Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and
     *     displays the name of the weekday.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }

    private static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Sunday";
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day range";
        }
        return dayName;
    }
}
