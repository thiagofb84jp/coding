package numbers;

public class Exercise07 {
    /*
     * 7 - Write a Java program to display first 10 lucus numbers.
     */
    public static void main(String[] args) {
        int n = 10;
        int n1 = 2, n2 = 1, n3;

        System.out.print("First ten Lucas a numbers: ");

        if (n > 1) {
            System.out.println("\n2\n1");
            for (int i = 2; i < n; ++i) {
                n3 = n2;
                n2 += n1;
                n1 = n3;
                System.out.println(n2);
            }
        } else if (n == 1) {
            System.out.println("\n2");
        } else {
            System.out.println("Input a positive number./");
        }
    }
}
