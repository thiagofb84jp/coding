package numbers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example10 {
    /*
     * 10 - Write a Java program to check whether a given number is a happy number or unhappy number.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = in.nextInt();

        System.out.println(isHappyNumber(number) ? "Happy Number" : "Unhappy Number");
    }

    private static boolean isHappyNumber(int number) {
        Set<Integer> uniqueNumber = new HashSet<Integer>();

        while (uniqueNumber.add(number)) {
            int value = 0;
            while (number > 0) {
                value += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = value;
        }
        return number == 1;
    }
}
