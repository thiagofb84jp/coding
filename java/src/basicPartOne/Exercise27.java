package basicPartOne;

import java.util.Scanner;

public class Exercise27 {
    /*
     * 27 - Write a Java program to convert a octal number to a hexadecimal number.
     */
    public static void main(String[] args) {
        String octalNum, hexNum;
        int decNum;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a octal number: ");
        octalNum = in.nextLine();

        decNum = Integer.parseInt(octalNum, 8);
        hexNum = Integer.toHexString(decNum);

        System.out.print("Equivalent hexadecimal number: " + hexNum + "\n");
    }
}
