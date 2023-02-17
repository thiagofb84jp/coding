package collections;

import java.util.ArrayList;

public class Exercise18 {
    /*
     * 18 - Write a Java program to test an array list is empty or not.
     */
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.add("Blue");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking the above array list is empty or not: " + c1.isEmpty());

        c1.removeAll(c1);
        System.out.println("Array list after remove all elements: " + c1);
        System.out.println("Checking the above array list is empty or not: " + c1.isEmpty());
    }
}
