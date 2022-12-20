package arrays;

public class Exercise02 {
    /*
     * 2 - Write a Java program to sum values of an array.
     */
    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : myArray) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
