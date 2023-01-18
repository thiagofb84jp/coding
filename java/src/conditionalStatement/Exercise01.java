package conditionalStatement;

import java.util.Scanner;

public class Exercise01 {
    /*
     * 1 - Write a Java program to get a number from the user and print whether it is positive or negative.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int input = in.nextInt();

        if (input > 0) {
            System.out.println("Number is a positive.");
        } else if (input < 0) {
            System.out.println("Number is a negative.");
        } else {
            System.out.println("Number is a zero.");
        }
    }
}