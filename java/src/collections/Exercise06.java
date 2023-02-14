package collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise06 {
    /*
     * 6 - Write a Java program to remove the third element from a array list.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");
        System.out.println(strings);

        strings.remove(2);
        System.out.println("After removing third element from the list:\n" + strings);
    }
}