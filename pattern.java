public class pattern {
    public static void main(String[] args) {
        System.out.println("pattern making");
        int n = 6;
        printpattern(n);
    }

    public static void printpattern(int n) {
        for (int i = 0; i < 5; i++) {

            System.out.println("1");
        }
        System.out.println();
    }
}

// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= 5; j++) {

// System.out.print("* ");
// }
// System.out.println();
// }
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");

// }
// System.out.println();

// for (int i = 0; i <= 5; i++) {
// for (int j = 0; j <= 5 - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= (2 * i - 1); j++) {
// if (i == 5 || j == 1 || j == 2 * 1 - i) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// System.out.println();

// }

// public class HollowPyramid {
// public static void main(String[] args) {
// int rows = 5;

// // Upper part of the pyramid
// for (int i = 1; i <= rows; i++) {
// // Print leading spaces
// for (int j = 1; j <= rows - i; j++) {
// System.out.print(" ");
// }

// // Print asterisks or spaces for the hollow part
// for (int j = 1; j <= 2 * i - 1; j++) {
// if (i == rows || j == 1 || j == 2 * i - 1) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }

// System.out.println(); // Move to the next line after each row
// }

// // Lower part of the pyramid (optional)
// // Uncomment the code below if you want to print the complete pyramid shape
// /*
// for (int i = rows - 1; i >= 1; i--) {
// // Print leading spaces
// for (int j = 1; j <= rows - i; j++) {
// System.out.print(" ");
// }

// // Print asterisks or spaces for the hollow part
// for (int j = 1; j <= 2 * i - 1; j++) {
// if (j == 1 || j == 2 * i - 1) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }

// System.out.println(); // Move to the next line after each row
// }
// */
// }
// }

// }
// }

// }}}
