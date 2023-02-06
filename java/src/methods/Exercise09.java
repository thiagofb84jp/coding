package methods;

public class Exercise09 {
    /*
     * 9 - Write a Java method to print characters between two characters (i.e. A to P ).
     */
    public static void main(String[] args) {
        printChars('(', 'z', 20);
    }

    private static void printChars(char char1, char char2, int n) {
        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
            System.out.print(char1 + " ");
            if (ctr % n == 0) {
                System.out.println("");
            }
        }
        System.out.print("\n");
    }
}
