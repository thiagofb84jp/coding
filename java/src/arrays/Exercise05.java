package arrays;

public class Exercise05 {
    /*
     * 5 - Write a Java program to test if an array contains a specific value.
     */
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        System.out.println(contains(myArray, 2013)); // true
        System.out.println(contains(myArray, 2015)); // false
        System.out.println(contains(myArray, 2265)); // true
        System.out.println(contains(myArray, 2457)); // false
    }

    private static boolean contains(int[] array, int item) {
        for (int n : array) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}
