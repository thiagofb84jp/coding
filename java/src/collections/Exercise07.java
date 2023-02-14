package collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise07 {
    /*
     * 7 - Write a Java program to search an element in a array list.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");

        if (strings.contains("Red")) {
            System.out.println("Found the element.");
        } else {
            System.out.println("There is no such element.");
        }
    }
}
