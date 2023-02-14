package arrays;

public class Exercise13 {
    /*
     * 13 - Write a Java program to find the duplicate values of an array of string values.
     */
    public static void main(String[] args) {
        String[] myArray = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if ((myArray[i].equals(myArray[j])) && (i != j)) {
                    System.out.println("Duplicate Element is: " + myArray[j]);
                }
            }
        }
    }
}
