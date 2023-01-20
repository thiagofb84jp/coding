package methods;

import java.util.Scanner;

public class Exercise02 {
    /*
     * 2 - Write a Java method to compute the average of three numbers.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();

        System.out.print("The average value is " + average(x, y, z) + "\n");
    }

    private static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
