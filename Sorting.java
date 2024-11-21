// public class Sorting {
// // Bubble Sort
// public static void main(String[] args) {
// int[] arr = { 12, 24, 76, 786, 23, 2467, 865 };
// int n = arr.length;
// for (int i = 0; i < n - 1; i++) {
// for (int j = 0; j < n - 1 - i; j++) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;

// }
// }
// }
// System.out.println("Sorting :");
// for (int num : arr) {
// System.out.println(num + " ");
// }
// }
// }

// public class Sorting {
// // Selection sorting
// public void selectionSort(int[] arr) {
// int n = arr.length;
// for (int i = 0; i < n - 1; i++) {
// int minIndex = i;
// for (int j = i + 1; j < n; j++) {
// if (arr[j] < arr[minIndex]) {
// minIndex = j;
// }
// }

// int temp = arr[minIndex];
// arr[minIndex] = arr[i];
// arr[i] = temp;
// }
// }

// public static void main(String[] args) {
// int[] arr = { 12, 23, 42, 575, 0, 453 };

// System.out.print("Original Array: ");
// for (int num : arr) {
// System.out.print(num + " ");
// }
// System.out.println();

// Sorting sorter = new Sorting();
// sorter.selectionSort(arr);
// System.out.print("Sorted Array: ");
// for (int num : arr) {arr
// System.out.print(num + " ");
// }
// }
// }
// public class Sorting {
// //insert sort
// public void Sorting(int[] arr) {
// int n = arr.length;
// for (int i = 0; i < n - 1; i++) {
// int key = arr[i];
// int j = i - 1;

// while (j >= 0 && arr[j] > key) {
// arr[j + 1] = arr[j];
// j--;
// }
// arr[j + 1] = key;
// }

// }

// public static void main(String[] args) {
// int[] arr = { 33, 335, 121, 767, 54,

// };
// System.out.print("Orignal:");
// for (int num : arr) {
// System.out.print(num + " ");
// }
// System.out.println(" ");

// Sorting sort = new Sorting();
// sort.Sorting(arr);
// System.out.print("Sorting :");
// for (int num : arr) {
// System.out.print(num + " ");
// }
// System.out.println(" ");

// }
// }
// import java.util.Arrays;

// public class Sorting {

//     public static void mergeSort(int[] arr) {
//         if (arr.length < 2)
//             return;

//         int mid = arr.length / 2;
//         int[] left = Arrays.copyOfRange(arr, 0, mid);
//         int[] right = Arrays.copyOfRange(arr, mid, arr.length);

//         mergeSort(left);
//         mergeSort(right);
//         merge(arr, left, right);
//     }

//     private static void merge(int[] arr, int[] left, int[] right) {
//         int i = 0, j = 0, k = 0;

//         while (i < left.length && j < right.length) {
//             if (left[i] <= right[j]) {
//                 arr[k++] = left[i++];
//             } else {
//                 arr[k++] = right[j++];
//             }
//         }

//         while (i < left.length) {
//             arr[k++] = left[i++];
//         }

//         while (j < right.length) {
//             arr[k++] = right[j++];
//         }
//     }

//     public static void main(String[] args) {
//         int[] array = { 38, 27, 43, 3, 9, 82, 10 };

//         System.out.println("Original array: " + Arrays.toString(array));

//         mergeSort(array);

//         System.out.println("Sorted array: " + Arrays.toString(array));

//     }
// }

public class Sorting {
    public static void main(String[] args) {
        int[] myArray = { 64, 34, 25, 12, 22, 11, 90, 5 };
        quicksort(myArray, 0, myArray.length - 1);

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }

    }

    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quicksort(array, low, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }

        array[high] = array[i];
        array[i] = pivot;
        return i;
    }
}
