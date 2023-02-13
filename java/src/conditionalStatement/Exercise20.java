package conditionalStatement;

import java.util.Scanner;

public class Exercise20 {
    /*
     * 20 - Write a program in Java to print the Floyd's Triangle.
     */
    public static void main(String[] args) {
        int numberOfRows;

        System.out.print("Input number of rows: ");

        Scanner in = new Scanner(System.in);
        numberOfRows = in.nextInt();

        int number = 1;

        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
