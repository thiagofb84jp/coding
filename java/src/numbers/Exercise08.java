package numbers;

public class Exercise08 {
    /*
     * 8 - Write a Java program to print out the first 10 Catalan numbers by extracting them from Pascal's triangle.
     */
    public static void main(String[] args) {
        int number = 10;
        int[] t = new int[number + 2];
        t[1] = 1;

        System.out.println("\nList 10 Catalan numbers:-\n");
        for (int i = 1; i <= number; i++) {
            for (int j = i; j > 1; j--) {
                t[j] = t[j] + t[j - 1];
            }
            t[i + 1] = t[i];

            for (int j = i + 1; j > 1; j--) {
                t[j] = t[j] + t[j - 1];
            }

            System.out.printf("\n%d ", t[i + 1] - t[i]);
        }
        System.out.printf("\n");
    }
}
