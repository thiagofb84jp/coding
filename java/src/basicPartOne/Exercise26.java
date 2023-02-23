package basicPartOne;

import java.util.Scanner;

public class Exercise26 {
    /*
     * 26 - Write a Java program to convert a octal number to a binary number.
     */
    public static void main(String[] args) {
        int[] octalNumValues = {0, 1, 10, 11, 100, 101, 110, 111};
        long octalNum, tempoctalNum, binaryNum, place;
        int rem;

        Scanner in = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        octalNum = in.nextLong();

        tempoctalNum = octalNum;
        binaryNum = 0;
        place = 1;

        while (tempoctalNum != 0) {
            rem = (int) (tempoctalNum % 10);
            binaryNum = octalNumValues[rem] * place + binaryNum;
            tempoctalNum /= 10;
            place *= 1000;
        }

        System.out.print("Equivalent binary number: " + binaryNum + "\n");
    }
}
