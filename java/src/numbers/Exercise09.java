package numbers;

import java.util.HashSet;

public class Exercise09 {
    /*
     * 9 - Write a Java program to find and print the first 10 happy numbers.
     */
    public static void main(String[] args) {
        System.out.println("First 10 Happy Numbers: ");
        for (long number = 1, count = 0; count < 8; number++) {
            if (happyNumbers(number)) {
                System.out.println(number);
                count++;
            }
        }
    }

    private static boolean happyNumbers(long number) {
        long m = 0;
        int digit = 0;

        HashSet<Long> cycle = new HashSet<Long>();
        while (number != 1 && cycle.add(number)) {
            m = 0;
            while (number > 0) {
                digit = (int) (number % 10);
                m += digit * digit;
                number /= 10;
            }
            number = m;
        }
        return number == 1;
    }
}
