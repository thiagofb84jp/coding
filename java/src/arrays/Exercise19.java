package arrays;

import java.util.Scanner;

public class Exercise19 {
    /*
     * 19 - Write a Java program to add two matrices of the same size.
     */
    public static void main(String[] args) {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number of rows of matrix : ");
        m = in.nextInt();
        System.out.print("Input the number of cols of matrix : ");
        n = in.nextInt();

        int arrayOne[][] = new int[m][n];
        int arrayTwo[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Input elements of first matrix: ");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                arrayOne[c][d] = in.nextInt();
            }
        }

        System.out.println("Input the elements of second matrix : ");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                arrayTwo[c][d] = in.nextInt();
            }
        }

        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                sum[c][d] = arrayOne[c][d] + arrayTwo[c][d];
            }
        }

        System.out.println("Sum of the matrices:- ");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }
    }
}