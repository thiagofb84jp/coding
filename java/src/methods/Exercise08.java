package methods;

import java.util.Scanner;

public class Exercise08 {
    /*
     * 8 - Write a Java method to compute the future investment value at a given interest rate for a specified number of
     *     years.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the investment amount: ");
        double investiment = in.nextDouble();
        System.out.print("Input the rate investment: ");
        double rate = in.nextDouble();
        System.out.print("Input the number of years: ");
        int year = in.nextInt();

        rate *= 0.01;

        System.out.println("Years    FutureValue");
        for (int i = 0; i <= year; i++) {
            int formatter = 19;
            if (i >= 10) {
                formatter = 18;
            }
            System.out.printf(i + "%" + formatter + ".2f\n", futureIntestimentValue(investiment, rate / 12, i));
        }
    }

    private static double futureIntestimentValue(double investimentAmount, double monthlyInterestRate, int years) {
        return investimentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
