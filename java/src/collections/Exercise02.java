package collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {
    /*
     * 2 - Write a Java program to iterate through all elements in a array list.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");

        for (String element : strings) {
            System.out.println(element);
        }
    }
}
