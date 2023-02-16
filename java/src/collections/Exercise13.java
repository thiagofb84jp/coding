package collections;

import java.util.ArrayList;

public class Exercise13 {
    /*
     * 13 - Write a Java program to compare two array lists.
     */
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Gree");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Gree");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1) {
            c3.add(c2.contains(e) ? "Yes" : "No");
        }

        System.out.println(c3);
    }
}
