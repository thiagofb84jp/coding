package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercise14 {
    /*
     * 14 - Write a Java program to find the common elements between two arrays (string values).
     */
    public static void main(String[] args) {
        String[] arrayOne = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] arrayTwo = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println("Array One : " + Arrays.toString(arrayOne));
        System.out.println("Array Two : " + Arrays.toString(arrayTwo));

        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i].equals(arrayTwo[j])) {
                    set.add(arrayOne[i]);
                }
            }
        }
        System.out.println("Common element : " + set);
    }
}
