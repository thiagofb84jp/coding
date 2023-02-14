package arrays;

import java.util.Arrays;

public class Exercise11 {
    /*
     * 11 - Write a Java program to reverse an array of integer values.
     */
    public static void main(String[] args) {
        int[] myArrayOne = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        System.out.println("Original array : " + Arrays.toString(myArrayOne));

        for (int i = 0; i < myArrayOne.length / 2; i++) {
            int temp = myArrayOne[i];
            myArrayOne[i] = myArrayOne[myArrayOne.length - i - 1];
            myArrayOne[myArrayOne.length - i - 1] = temp;
        }

        System.out.println("Reverse array : " + Arrays.toString(myArrayOne));
    }
}
