package collections;

import java.util.ArrayList;

public class Exercise16 {
    /*
     * 16 - Write a Java program to clone an array list to another array list.
     */
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);

        ArrayList<String> newC1 = (ArrayList<String>) c1.clone();
        System.out.println("Cloned array list: " + newC1);
    }
}
