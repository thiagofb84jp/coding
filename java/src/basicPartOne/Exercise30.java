package basicPartOne;

import java.util.Scanner;

public class Exercise30 {
    /*
     * 30 - Write a Java program to convert a hexadecimal to a octal number.
     */
    public static void main(String[] args) {
        String hexDecNum;
        int decNum, i = 1, j;
        int octalNum[] = new int[100];

        Scanner in = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        hexDecNum = in.nextLine();

        decNum = hexToDecimal(hexDecNum);

        while (decNum != 0) {
            octalNum[i++] = decNum % 8;
            decNum = decNum / 8;
        }

        System.out.print("Equivalent of octal number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(octalNum[j]);
        }
    }

    private static int hexToDecimal(String str) {
        String digits = "0123456789ABCDEF";
        str = str.toUpperCase();
        int val = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }

        return val;
    }
}