package basicPartOne;

import java.util.Scanner;

public class Exercise06 {
    /*
     * 6 - Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = in.nextInt();

        System.out.print("Input the second number: ");
        int num2 = in.nextInt();

        calculator(num1, num2);
    }

    private static void calculator(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        int subtraction = num1 - num2;
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is: " + subtraction);

        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        if (num2 == 0) {
            System.out.println("Division by zero not allowed.");
        }

        int division = num1 / num2;
        System.out.println("The division of " + num1 + " and " + num2 + " is: " + division);
    }
}
