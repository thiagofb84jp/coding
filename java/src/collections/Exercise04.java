package collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise04 {
    /*
     * 4 - Write a Java program to retrieve an element (at a specified index) from a given array list.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");
        System.out.println(strings);

        String element = strings.get(0);
        System.out.println("First element: " + element);
        element = strings.get(2);
        System.out.println("Third element: " + element);
    }
}
