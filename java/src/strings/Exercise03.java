package strings;

public class Exercise03 {
    /*
     * 3 - Write a Java program to get the character (Unicode code point) before the specified index within the String.
     */
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("Original String: " + str);

        int value1 = str.codePointBefore(1);
        int value2 = str.codePointBefore(9);

        System.out.println("Character(unicode point) = " + value1);
        System.out.println("Character(unicode point) = " + value2);
    }
}
