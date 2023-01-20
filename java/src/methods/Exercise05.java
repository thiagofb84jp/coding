package methods;

import java.util.Scanner;

public class Exercise05 {
    /*
     * 5 - Write a Java method to count all words in a string.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("Number of words in the string: " + countWords(str) + "\n");
    }

    private static int countWords(String str) {
        int count = 0;

        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count += 1;
        }
        return count;
    }
}
