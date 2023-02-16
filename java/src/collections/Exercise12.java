package collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise12 {
    /*
     * 12 - Write a Java program to extract a portion of a array list.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");
        System.out.println("Original list: " + strings);

        List<String> subList = strings.subList(0, 3);
        System.out.println("List of first three elements: " + subList);
    }
}
