package strings;

public class Exercise04 {
    /*
     * 4 - Write a Java program to count a number of Unicode code points in the specified text range of a String.
     */
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("Original String: " + str);

        int ctr = str.codePointCount(1, 10);

        System.out.println("Codepoint count = " + ctr);
    }
}
