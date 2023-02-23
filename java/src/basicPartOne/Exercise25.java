package basicPartOne;

import java.util.Scanner;

public class Exercise25 {
    /*
     * 25 - Write a Java program to convert a octal number to a decimal number.
     */
    public static void main(String[] args) {
        long octalNum, decNum = 0;
        int i = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        octalNum = in.nextLong();

        while (octalNum != 0) {
            decNum = (long) (decNum + (octalNum % 10) * Math.pow(8, i++));
            octalNum = octalNum / 10;
        }

        System.out.print("Equivalent decimal number: " + decNum + "\n");
    }
}