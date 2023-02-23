package basicPartOne;

import java.util.Scanner;

public class Exercise21 {
    /*
     * 21 - Write a Java program to convert a decimal number to octal number.
     */
    public static void main(String[] args) {
        int decNum, rem, quot, i = 1;
        int octNum[] = new int[100];

        Scanner in = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        decNum = in.nextInt();

        quot = decNum;

        while (quot != 0) {
            octNum[i++] = quot % 8;
            quot = quot / 8;
        }

        System.out.print("Octal number is: ");

        for (int j = i - 1; j > 0; j--) {
            System.out.print(octNum[j]);
        }
    }
}
