package collections;

import java.util.ArrayList;

public class Exercise21 {
    /*
     * 21 - Write a Java program to replace the second element of a ArrayList with the specified element.
     */
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        System.out.println("Original array list: " + colors);

        String newColor = "White";
        colors.set(1, newColor);
        System.out.println("Replace second element with 'White'.");
        System.out.println("New list: " + colors);
    }
}