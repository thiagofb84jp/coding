package arrays;

import java.util.ArrayList;

public class Exercise21 {
    /*
     * 21 - Write a Java program to convert an ArrayList to an array.
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("PHP");
        arrayList.add("C#");
        arrayList.add("C++");
        arrayList.add("Perl");

        String[] myArray = new String[arrayList.size()];
        arrayList.toArray(myArray);

        for (String string : myArray) {
            System.out.println(string);
        }
    }
}
