package strings;

public class Exercise09 {
    /*
     * 09 - Write a Java program to compare a given string to the specified character sequence.
     */
    public static void main(String[] args) {
        String str1 = "example.com";
        String str2 = "Example.com";
        CharSequence charSequence = "example.com";

        System.out.println("Comparing " + str1 + " and " + charSequence + ": " + str1.contentEquals(charSequence));
        System.out.println("Comparing " + str2 + " and " + charSequence + ": " + str2.contentEquals(charSequence));
    }
}
