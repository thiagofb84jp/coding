package strings;

public class Exercise01 {
    /*
     * 1 - Write a Java program to get the character at the given index within the String.
     */
    public static void main(String[] args) {
        String str = "Java Exercises!";
        System.out.println("Original String: " + str);

        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("The character at position 0 is: " + (char) index1);
        System.out.println("The character at position 10 is: " + (char) index2);
    }
}
