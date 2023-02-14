package collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise05 {
    /*
     * 5 - Write a Java program to update specific array element by given element.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");
        System.out.println(strings);

        strings.set(2, "Yellow");
        System.out.println(strings);
    }
}
