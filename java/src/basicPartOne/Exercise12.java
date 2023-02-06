package basicPartOne;

import java.util.Scanner;

public class Exercise12 {
    /*
     * 12 - Write a Java program that takes five numbers as input to calculate and print the average of the numbers.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = in.nextInt();

        System.out.print("Input the second number: ");
        int num2 = in.nextInt();

        System.out.print("Input the third number: ");
        int num3 = in.nextInt();

        System.out.print("Input the fourth number: ");
        int num4 = in.nextInt();

        System.out.print("Input the fifth number: ");
        int num5 = in.nextInt();

        System.out.println("Average of five numbers is: " + average(num1, num2, num3, num4, num5));
    }

    private static double average(int num1, int num2, int num3, int num4, int num5) {
        return (num1 + num2 + num3 + num4 + num5) / 5;
    }
}
