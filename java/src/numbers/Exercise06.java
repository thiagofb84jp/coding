package numbers;

public class Exercise06 {
    /*
     * 6 - Write a Java program to generate and show the first 15 narcissistic decimal numbers.
     */
    public static void main(String[] args) {
        for (long number = 0, ctr = 0; ctr < 15; number++) {
            if (isNarcDecNumber(number)) {
                System.out.print(number + " ");
                ctr++;
            }
        }
        System.out.println();
    }

    private static boolean isNarcDecNumber(long number) {
        if (number < 0) {
            return false;
        }

        String str1 = Long.toString(number);
        int x = str1.length();
        long sum = 0;

        for (char c : str1.toCharArray()) {
            sum += Math.pow(Character.digit(c, 10), x);
        }
        return sum == number;
    }
}