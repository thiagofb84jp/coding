package methods;

public class Exercise07 {
    /*
     * 7 - Write a Java method to display the first 50 pentagonal numbers.
     */
    public static void main(String[] args) {
        int count = 1;

        for (int i = 0; i <= 50; i++) {
            System.out.printf("%-6d", getPentagonalNumber(i));

            if (count % 10 == 0) {
                System.out.println();
            }
            count++;
        }
    }

    private static int getPentagonalNumber(int i) {
        return (i * (3 * i - 1)) / 2;
    }
}
