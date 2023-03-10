package numbers;

import java.util.Spliterator;

public class Exercise04 {
    /*
     * 4 - Write a Java program to generate and show all Kaprekar numbers less than 1000.
     */
    public static void main(String[] args) {
        int ctr = 0;
        int base = (args.length > 0) ? Integer.parseInt(args[0]) : 10;

        for (long n = 1; n <= 1000; n++) {
            String sqrStr = Long.toString(n * n, base);

            for (int j = 0; j < sqrStr.length() / 2 + 1; j++) {
                String[] parts = splitNumbers(sqrStr, j);
                long firstNumber = Long.parseLong(parts[0], base);
                long secondNumber = Long.parseLong(parts[1], base);

                if (secondNumber == 0) {
                    break;
                }

                if (firstNumber + secondNumber == n) {
                    System.out.println(Long.toString(n, base) + "\t" + sqrStr + "\t  " + parts[0] + " + " + parts[1]);
                    ctr++;
                    break;
                }
            }
        }
        System.out.println(ctr + " Kaprekar numbers.");
    }

    private static String[] splitNumbers(String str, int idx) {
        String[] ans1 = new String[2];
        ans1[0] = str.substring(0, idx);

        if (ans1[0].equals("")) {
            ans1[0] = "0";
        }
        ans1[1] = str.substring(idx);

        return ans1;
    }
}
