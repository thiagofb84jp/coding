package arrays;

import java.util.Arrays;

public class Exercise01 {
    /*
     *  01 - Write a Java program to sort a numeric array and a string array.
     */
    public static void main(String[] args) {
        int[] myArrayOne = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArrayTwo = {
                "Java",
                "Ruby",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("Original numeric array: " + Arrays.toString(myArrayOne));
        Arrays.sort(myArrayOne);
        System.out.println("Sorted numeric array: " + Arrays.toString(myArrayOne));

        System.out.println("Original string array: " + Arrays.toString(myArrayTwo));
        Arrays.sort(myArrayTwo);
        System.out.println("Sorted string array: " + Arrays.toString(myArrayTwo));
    }
}
