package arrays;

import java.util.Arrays;

public class Exercise09 {
    /*
     * 9 - Write a Java program to insert an element (specific position) into an array.
     */
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int indexPosition = 2;
        int newValue = 5;

        System.out.println("Original array: " + Arrays.toString(myArray));

        for (int i = myArray.length - 1; i > indexPosition; i--) {
            myArray[i] = myArray[i - 1];
        }

        myArray[indexPosition] = newValue;
        Arrays.sort(myArray);
        System.out.println("New array (sorted): " + Arrays.toString(myArray));
    }
}
