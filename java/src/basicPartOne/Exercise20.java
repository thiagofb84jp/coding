package basicPartOne;

import java.util.Scanner;

public class Exercise20 {
    /*
     * 20 - Write a Java program to convert a decimal number to hexadecimal number.
     */
    public static void main(String[] args) {
        int decNum, rem;
        String hexDecNumber = "";

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner in = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        decNum = in.nextInt();

        while (decNum > 0) {
            rem = decNum % 16;
            hexDecNumber = hex[rem] + hexDecNumber;
            decNum = decNum / 16;
        }
        System.out.print("Hexadecimal number is: " + hexDecNumber + "\n");
    }
}
