package conditionalStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise11 {
    /*
     * 11 - Write a program in Java to display n terms of natural numbers and their sum.
     */
    public static void main(String[] args) {
        int n, sum = 0;
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            n = in.nextInt();
        }
        System.out.println("The first 'n' natural numbers are: " + n);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of natural number upto " + n + " terms: " + sum);
    }
}
