package numbers;

import static java.util.stream.LongStream.rangeClosed;

public class Exercise02 {
    /*
     * 2 - Write a Java program to classify Abundant, deficient and perfect number (integers) between 1 to 10,000.
     */
    public static void main(String[] args) {
        int countDeficientNo = 0;
        int countPerfectNo = 0;
        int countAbundantNo = 0;

        for (long i = 1; i <= 10000L; i++) {
            long sum = properDivsSum(i);

            if (sum < i) {
                countDeficientNo++;
            } else if (sum == i) {
                countPerfectNo++;
            } else {
                countAbundantNo++;
            }

            System.out.println("Number Counting [(Integers) between 1 to 10,000]: ");
            System.out.println("Deficient number: " + countDeficientNo);
            System.out.println("Perfect number: " + countPerfectNo);
            System.out.println("Abundant number: " + countAbundantNo);
        }
    }

    private static Long properDivsSum(long number) {
        return rangeClosed(1, (number + 1) / 2).filter(i -> number % i == 0 && number != i).sum();
    }
}
