package strings;

public class Exercise07 {
    /*
     * 7 - Write a Java program to concatenate a given string to the end of another string.
     */
    public static void main(String[] args) {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String str3 = str1.concat(str2);

        System.out.println("The concatenated string: " + str3);
    }
}
