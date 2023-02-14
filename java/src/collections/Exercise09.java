package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise09 {
    /*
     * 9 - Write a Java program to copy one array list into another.
     */
    public static void main(String[] args) {
        List<String> stringsOne = new ArrayList<String>();
        stringsOne.add("1");
        stringsOne.add("2");
        stringsOne.add("3");
        stringsOne.add("4");
        stringsOne.add("5");
        System.out.println("List One: " + stringsOne);

        List<String> stringsTwo = new ArrayList<String>();
        stringsTwo.add("A");
        stringsTwo.add("B");
        stringsTwo.add("C");
        stringsTwo.add("D");
        stringsTwo.add("E");
        System.out.println("List Two: " + stringsTwo);

        Collections.copy(stringsOne, stringsTwo);
        System.out.println("Copy List One to List Two,\nAfter copy: ");
        System.out.println("List One: " + stringsOne);
        System.out.println("List Two: " + stringsTwo);
    }
}
