package basicPartOne;

import java.util.Locale;
import java.util.Scanner;

public class Exercise28 {
    /*
     * 28 - Write a Java program to convert a hexadecimal to a decimal number.
     */
    public static void main(String[] args) {
        String hexadecNum;
        int decNum;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        hexadecNum = in.nextLine();

        decNum = hexToDecimal(hexadecNum);
        System.out.print("Equivalent decimal number is: " + decNum + "\n");
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
