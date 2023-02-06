package basicPartOne;

import java.util.Scanner;

public class Exercise19 {
    /*
     * 19 - Write a Java program to convert a decimal number to binary number.
     */
    public static void main(String[] args) {
        int decNum, quot, i = 1, j;
        int binNum[] = new int[100];

        Scanner in = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        decNum = in.nextInt();

        quot = decNum;
        while (quot != 0) {
            binNum[i++] = quot % 2;
//            quot = quot/2;
            quot /= 2;
        }

        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(binNum[j]);
        }
        System.out.print("\n");
    }
}
