package basicPartOne;

import java.util.Scanner;

public class Exercise22 {
    /*
     * 22 - Write a Java program to convert a binary number to decimal number.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, remainder;

        System.out.print("Input a binary number: ");
        binaryNumber = in.nextLong();

        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.print("Decimal number: " + decimalNumber);
    }
}