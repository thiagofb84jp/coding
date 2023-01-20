package methods;

import java.util.Scanner;

public class Exercise04 {
    /*
     * 4 - Write a Java method to count all vowels in a string.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("Number of Vowels in the string: " + countVowels(str) + "\n");
    }

    private static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
