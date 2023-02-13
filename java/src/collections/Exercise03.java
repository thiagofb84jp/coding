package collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise03 {
    /*
     * 3 - Write a Java program to insert an element into the array list at the first position.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");
        System.out.println("Before adding new element " + strings);

        strings.add(0, "Pink");
        strings.add(5, "Yellow");

        System.out.println("Before adding new element " + strings);
    }
}
