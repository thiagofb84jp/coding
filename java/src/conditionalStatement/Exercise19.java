package conditionalStatement;

import java.util.Scanner;

public class Exercise19 {
    /*
     * 19 - Write a program in Java to print such pattern like a pyramid with a number which will repeat the number in
     *       the same row.
     */
    public static void main(String[] args) {
        int n, s, x;

        System.out.print("Input the number of rows : ");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        s = n + 4 - 1;

        for (int i = 1; i <= n; i++) {
            for (x = s; x != 0; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }

    }
}
