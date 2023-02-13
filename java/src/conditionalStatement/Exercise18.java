package conditionalStatement;

import java.util.Scanner;

public class Exercise18 {
    /*
     * 18 - Write a program in Java to print such pattern like right angle triangle with number increased by 1.
     */
    public static void main(String[] args) {
        int n, k = 1;

        System.out.print("Input number of rows : ");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++);
            }
            System.out.println("");
        }
    }
}