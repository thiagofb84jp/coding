package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise20 {
    /*
     * 20 - Write a Java program to convert an array to ArrayList.
     */
    public static void main(String[] args) {
        String[] myArray = new String[]{"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        System.out.println("Common Array : " + Arrays.toString(myArray));

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(myArray));
        System.out.println("Array List : " + arrayList);
    }
}
