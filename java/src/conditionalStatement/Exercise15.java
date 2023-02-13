package conditionalStatement;

import java.util.Scanner;

public class Exercise15 {
    /*
     * 15 - Write a program in Java to display the n terms of odd natural number and their sum.
     */
    public static void main(String[] args) {
        int n, sum = 0;

        System.out.print("Input number of terms is: ");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println("The odd numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }
        System.out.println("The sum of odd natural number upto " + n + " terms is: " + sum);
    }
}
