package arrays;

import java.util.*;

public class sorting_algo {

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

    static int[] selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minValuePos = i;
            for(int j = i+1; j<n; j++){
                if(arr[minValuePos]> arr[j]){
                    minValuePos = j;
                }
            }
            int temp = arr[minValuePos];
            arr[minValuePos] = arr[i];
            arr[i]= temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 3, 1, 2 };
        // System.out.print(Arrays.toString(bubbleSort(arr)));
        System.out.print(Arrays.toString(selectionSort(arr)));
    }
}
