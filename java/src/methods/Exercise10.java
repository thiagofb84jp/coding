package methods;

import java.util.Scanner;

public class Exercise10 {
    /*
     * 10 - Write a Java method to check whether an year (integer) entered by the user is a leap year or not.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a year");
        int year = in.nextInt();

        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int y) {
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        return a && (b || c);
    }
}
