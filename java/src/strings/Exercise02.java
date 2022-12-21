package strings;

import java.io.CharArrayReader;

public class Exercise02 {
    /*
     * 2 - Write a Java program to get the character (Unicode code point) at the given index within the String.
     */
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("Original String: " + str);

        int value1 = str.codePointAt(1);
        int value2 = str.codePointAt(9);

        System.out.println("Character(unicode point for value one)) = " + value1);
        System.out.println("Character(unicode point for value two)) = " + value2);
    }
}