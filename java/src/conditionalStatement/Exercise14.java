package conditionalStatement;

import java.util.Scanner;

public class Exercise14 {
    /*
     * 14 - Write a program in Java to display the multiplication table of a given integer.
     */
    public static void main(String[] args) {
        int j, n;

        System.out.println("Input the number (Table to be calculated): ");
        System.out.print("Input number of terms : ");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println("\n");
        for (j = 0; j <= n; j++) {
            System.out.println(n + " X " + j + " = " + n * j);
        }
    }
}
