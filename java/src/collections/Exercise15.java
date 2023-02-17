package collections;

import java.util.ArrayList;

public class Exercise15 {
    /*
     * 15 - Write a Java program to join two array lists.
     */
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of the first array: " + c1);

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of the first array: " + c2);

        ArrayList<String> a = new ArrayList<String>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New array: " + a);
    }
}
