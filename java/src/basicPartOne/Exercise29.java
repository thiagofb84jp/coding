package basicPartOne;

import java.util.Scanner;

public class Exercise29 {
    /*
     * 29 - Write a Java program to convert a hexadecimal to a binary number.
     */
    public static void main(String[] args) {
        String hexDecNum;
        int decNum, i = 1, j;
        int binNum[] = new int[100];

        Scanner in = new Scanner(System.in);
        System.out.print("Enter hexadecimal number: ");
        hexDecNum = in.nextLine();

        decNum = hexToDecimal(hexDecNum);

        while (decNum != 0) {
            binNum[i++] = decNum % 2;
            decNum = decNum / 2;
        }

        System.out.print("Equivalent binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(binNum[j]);
        }
    }

    private static int hexToDecimal(String str) {
        int val = 0;
        String digits = "0123456789ABCDEF";
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }

        return val;
    }
}
