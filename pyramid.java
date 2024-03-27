public class pyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            // Print spaces in increasing order
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print numbers in decreasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
