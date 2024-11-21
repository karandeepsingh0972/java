public class patterntask {
    private static int j;

    public static void main(String[] args) {

        // int rows = 5;
        // for (int i = 5; i >= 0; i--) {
        // for (int j = 1; j <= 5 - i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= 2 * i - 1; j++) {
        // if (j == 1 || j == 2 * i - 1 || j == 3) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; i < 5; j++) {
        // if (j == 0 || j == 4 || (i == j && i < 2) || (i + j == 4 && i < 2)) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // // Loop through each row
        // for (int i = 0; i < 5; i++) {
        // // Loop through each column
        // for (int j = 0; j < 5; j++) {
        // // Print asterisk for the 'M' pattern
        // if (j == 0 || j == 5 - 1 || (i == j && i < 5 / 2) || (i + j == 5 - 1 && i < 5
        // / 2)) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        int rows = 7;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                // Print 'M' pattern
                if (j == 0 || j == rows - 1 || (i == j && j <= rows / 2) || (i + j == rows - 1 && i <= rows / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
