package conditionalStatement;

import java.util.Scanner;

public class Exercise13 {
    /*
     * 13 - Write a program in Java to display the cube of the number upto given an integer.
     */
    public static void main(String[] args) {
        int number;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + Math.pow(i, 3));
        }
    }
}
