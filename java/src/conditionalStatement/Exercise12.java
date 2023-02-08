package conditionalStatement;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Scanner;

public class Exercise12 {
    /*
     * 12 - Write a program in Java to input 5 numbers from keyboard and find their sum and average.
     */
    public static void main(String[] args) {
        int number = 0, sum = 0;
        double average;

        System.out.println("Input the 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            number = in.nextInt();

            sum += number;
        }
        average = sum / 5;
        
        System.out.println("The sum of 5 no is : " + sum + "\nThe average is : " + average);
    }
}
