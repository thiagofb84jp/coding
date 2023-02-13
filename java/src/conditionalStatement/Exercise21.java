package conditionalStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise21 {
    /*
     * 21 - Write a program in Java to display the pattern like a diamond.
     */
    public static void main(String[] args) {
        int r;

        System.out.print("Input the number of rows (half of the diamond) : ");

        Scanner in = new Scanner(System.in);
        r = in.nextInt();

        for (int i = 0; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = r - 1; i >= 1; i--) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
