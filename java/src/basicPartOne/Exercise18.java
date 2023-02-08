package basicPartOne;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        long bin1, bin2, multiply = 0;
        int digit, factor = 1;

        Scanner in = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        bin1 = in.nextLong();
        System.out.print("Input the second binary number: ");
        bin2 = in.nextLong();

        while (bin2 != 0) {
            digit = (int) (bin2 % 10);
            if (digit == 1) {
                bin1 = bin1 * factor;
                multiply = binaryProduct((int) bin1, (int) multiply);
            } else {
                bin1 = bin1 * factor;
            }
            bin2 = bin2 / 10;
            factor = 10;
        }
        System.out.print("Product of two binary numbers: " + multiply + "\n");
    }

    private static int binaryProduct(int bin1, int bin2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binProdResult = 0;

        while (bin1 != 0 || bin2 != 0) {
            sum[i++] = (bin1 % 10 + bin2 % 10 + remainder) % 2;
            remainder = (bin1 % 10 + bin2 % 10 + remainder) / 2;
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;
        }

        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;

        while (i >= 0) {
            binProdResult = binProdResult * 10 + sum[i--];
        }
        return binProdResult;
    }
}