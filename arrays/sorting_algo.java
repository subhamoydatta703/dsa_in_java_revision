package arrays;

import java.util.*;

public class sorting_algo {

    // display array
    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // bubble sort
    static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= (n - 2); i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;

    }
    // selection sort

    static int[] selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minValuePos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minValuePos] > arr[j]) {
                    minValuePos = j;
                }
            }
            int temp = arr[minValuePos];
            arr[minValuePos] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // insertion sort
    static int[] insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i], prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        return arr;
    }
    // quick sort

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        // place pivot at index i
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 3, 1, 2 };
        // System.out.print(Arrays.toString(bubbleSort(arr)));
        // System.out.print(Arrays.toString(selectionSort(arr)));
        // System.out.print(Arrays.toString(insertionSort(arr)));
        quickSort(arr, 0, 4);
        displayArray(arr);
    }
}
