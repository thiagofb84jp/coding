package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise10 {
    /*
     * 10 - Write a Java program to shuffle elements in a array list.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Green");
        strings.add("Orange");
        strings.add("White");
        strings.add("Black");
        System.out.println("List before shuffling:\n" + strings);

        Collections.shuffle(strings);
        System.out.println("List after shuffling:\n" + strings);
    }
}
