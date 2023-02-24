package basicPartOne;

public class Exercise31 {
    /*
     * 31 - Write a Java program to check whether Java is installed on your computer.
     */
    public static void main(String[] args) {
        System.out.print("\nJava Version: " + System.getProperty("java.version"));
        System.out.print("\nJava Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.print("\nJava Home: " + System.getProperty("java.home"));
        System.out.print("\nJava Vendor: " + System.getProperty("java.vendor"));
        System.out.print("\nJava Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.print("\nJava Class Path: " + System.getProperty("java.class.path") + "\n");
    }
}
