package collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    /*
     * 1 - Write a Java program to create a new array list, add some elements (string) and print out the collection.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");

        System.out.println(strings);
    }
}
