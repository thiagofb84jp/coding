package methods;

import java.util.Scanner;

public class Exercise06 {
    /*
     * 6 - Write a Java method to compute the sum of the digits in an integer.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int digits = in.nextInt();

        System.out.print("The sum is " + sumDigits(digits));
    }

    private static int sumDigits(long n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
}
