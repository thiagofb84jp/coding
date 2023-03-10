package arrays;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class Exercise16 {
    /*
     * 16 - Write a Java program to remove duplicate elements from an array.
     */
    public static void main(String[] args) {
        uniqueArray(new int[]{0, 3, -2, 4, 3, 2});
        uniqueArray(new int[]{10, 22, 10, 20, 11, 22});
    }

    private static void uniqueArray(int[] myArray) {
        System.out.println("Original Array : ");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }

        int noUniqueElements = myArray.length;
        for (int i = 0; i < noUniqueElements; i++) {
            for (int j = i + 1; j < noUniqueElements; j++) {
                if (myArray[i] == myArray[j]) {
                    myArray[j] = myArray[noUniqueElements - 1];
                    noUniqueElements--;
                    j--;
                }
            }
        }

        int[] arrayOne = Arrays.copyOf(myArray, noUniqueElements);
        System.out.println();
        System.out.println("Array with unique values : ");

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + "\t");
        }

        System.out.println();
        System.out.println("---------------------------");
    }
}
