package basicPartOne;

import java.util.Scanner;

public class Exercise24 {
    /*
     * 24 - Write a Java program to convert a binary number to a Octal number.
     */
    public static void main(String[] args) {
        int binNum, binNum1, rem, decNum = 0, quot, i = 1, j;
        int octNum[] = new int[100];

        Scanner in = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        binNum = in.nextInt();
        binNum1 = binNum;

        while (binNum > 0) {
            rem = binNum % 10;
            decNum = decNum + rem * i;
            i = i * 2;
            binNum = binNum / 10;
        }

        i = 1;
        quot = decNum;

        while (quot > 0) {
            octNum[i++] = quot % 8;
            quot = quot / 8;
        }

        System.out.print("Equivalent octal value of " + binNum1 + " is : ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(octNum[j]);
        }
    }
}
