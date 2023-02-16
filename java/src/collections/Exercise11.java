package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise11 {
    /*
     * 11 - Write a Java program to reverse elements in a array list.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");
        System.out.println("List before reversing :\n" + strings);

        Collections.reverse(strings);
        System.out.println("List after reversing :\n" + strings);
    }
}
