package arrays;

import java.util.Arrays;

public class Exercise06 {
    /*
     * 6 - Write a Java program to find the index of an array element.
     */
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Index position of 25 is: " + findIndex(myArray, 25));
        System.out.println("Index position of 77 is: " + findIndex(myArray, 77));
    }

    private static int findIndex(int[] myArray, int t) {
        if (myArray == null) {
            return -1;
        }

        int len = myArray.length;
        int i = 0;

        while (i < len) {
            if (myArray[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }
}

