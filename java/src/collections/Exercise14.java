package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise14 {
    /*
     * 14 - Write a Java program of swap two elements in an array list.
     */
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Array list before Swap: ");
        for (String a : c1) {
            System.out.println(a);
        }
        System.out.println();

        Collections.swap(c1, 0, 2);
        System.out.println("Array list after Swap: ");
        for (String b : c1) {
            System.out.println(b);
        }
    }
}
