package numbers;

import java.util.Scanner;

public class Exercise03 {
    /*
     * 3 - Write a Java program to generate random integers in a specific range.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the starting number of the range: ");
        int num1 = in.nextInt();

        System.out.println("Input the ending number of the range: ");
        int num2 = in.nextInt();

        int randomNumber = (int) (num1 + (Math.random() * (num2 - num1) + 1));
        System.out.println(randomNumber);
    }
}
