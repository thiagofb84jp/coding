package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise08 {
    /*
     * 8 - Write a Java program to sort a given array list.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");
        System.out.println("List before sort: " + strings);

        Collections.sort(strings);
        System.out.println("List after sort: " + strings);
    }
}
