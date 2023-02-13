package conditionalStatement;

import java.util.Scanner;

public class Exercise16 {
    /*
     * 16 - Write a program in Java to display the pattern like right angle triangle with a number.
     */
    public static void main(String[] args) {
        int n;

        System.out.print("Input numbers of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
