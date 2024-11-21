// public class ArraysDs {
// // ArrayTraversal
// public static void main(String[] args) {
// int[] array = { 1, 2, 3, 4, 5, 6 };
// for (int i = 0; i < array.length; i++) {
// System.out.println("Element at index " + i + ":" + array[i]);
// }
// }
// }

// }
// public class ArrsysDs {
// // insert arrays
// public static void main(String[] args) {
// int[] array = new int[6];
// array[0] = 1;
// array[1] = 2;
// array[2] = 3;
// array[3] = 4;
// array[4] = 5;
// for (int i = 5; i > 2; i--) {
// array[i] = array[i - 1];
// }
// array[2] = 94646;
// for (int i = 0; i < array.length; i++) {
// System.out.println("Element at index" + i + ":" + array[i]);
// }
// }
// }
// public class ArrsysDs {
// // delect array
// public static void main(String[] args) {
// int[] array = { 1, 22, 33, 54, 75, 6 };
// int deleteIndex = 2;
// for (int i = deleteIndex; i < array.length - 1; i++) {
// array[i] = array[i + 1];

// }
// for (int i = 0; i < array.length - 1; i++) {
// System.out.println("Element in index" + i + ":" + array[i]);
// }
// }
// }
// public class ArraysDs {
// // maxumum elment
// public static void main(String[] args) {
// int[] numbers = { 4, 9, 76, 43, 23, 46 };
// int max = numbers[0];

// for (int i = 1; i < numbers.length; i++) {
// if (numbers[i] > max) {
// max = numbers[i];

// }
// }
// System.out.println("Maximum element is:" + max);
// }
// }
// }
// public class ArraysDs {
// // Reverse arrays
// public static void main(String[] args) {
// int[] numbers = { 1, 2, 3, 4, 5, 6 };
// int start = 0;
// int end = numbers.length - 1;

// while (start < end) {
// int temp = numbers[start];
// numbers[start] = numbers[end];
// numbers[end] = temp;

// start++;
// end--;
// }
// System.out.println("Reverse array:");
// for (int num : numbers) {
// System.out.print(num + " ");
// ;
// }
// }
// }

// }
// public class ArraysDs {
// public static void main(String[] args) {
// int[][] twoDArray = {
// { 1, 2, 3 },
// { 4, 5, 6 },
// { 7, 8, 9 }
// };

// int target = 5; // Example target
// boolean found = false;

// for (int i = 0; i < twoDArray.length; i++) {
// for (int j = 0; j < twoDArray[i].length; j++) {
// if (twoDArray[i][j] == target) {
// found = true;
// System.out.println("Found at: (" + i + ", " + j + ")");
// break; // Exit the inner loop
// }
// }
// if (found)
// break; // Exit the outer loop if found
// }

// if (!found) {
// System.out.println("Value not found.");
// }
// }
// }
