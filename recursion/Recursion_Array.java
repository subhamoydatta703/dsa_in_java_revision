package recursion;

import java.util.ArrayList;

public class Recursion_Array {

    // Checking sorted array
    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;
        if (arr[i + 1] < arr[i]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // linear search method 1
    static void linSearch(int[] arr, int i, int t) {
        if (i > arr.length - 1) {
            System.out.println("Not found");
            return;
        }
        if (arr[i] == t) {
            System.out.println("Found at index: " + i);
            return;
        }
        linSearch(arr, i + 1, t);

    }

    // linear search method 2

    static int linearSearch(int[] arr, int i, int t) {
        if (i > arr.length - 1)
            return -1;
        if (arr[i] == t)
            return i;
        return linearSearch(arr, i + 1, t);
    }

    // Find multiple indices in a linear search of an array using an ArrayList
    static ArrayList<Integer> multipleSearch(int[] arr, int i, int t) {
        if (i > arr.length - 1)
            return new ArrayList<>();
        ArrayList<Integer> list = multipleSearch(arr, i + 1, t);
        if (arr[i] == t) {
            list.add(i);
        }

        return list;

    }

    // Recutsive rotated binary search
    static int rotatedBinarySearch(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;
        int mid = s + (e - s) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return rotatedBinarySearch(arr, target, s, mid - 1);
            } else {
                return rotatedBinarySearch(arr, target, mid + 1, e);
            }
        } else {
            if (target >= arr[mid] && target <= arr[e]) {
                return rotatedBinarySearch(arr, target, mid + 1, e);
            } else {
                return rotatedBinarySearch(arr, target, s, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 2, 7, 8, 2, 9, 10, 15, 2, 25 };
        // System.out.println(isSorted(arr, 0));
        // isSorted(arr, 0);
        // linSearch(arr, 0, 4);
        // int val = linearSearch(arr, 0, 3);
        // if (val == -1)
        // System.out.println("Not Found");
        // else
        // System.out.println("Found at index: " + val);
        // System.out.println(multipleSearch(arr, 0, 2));
        System.out.println(rotatedBinarySearch(arr, 9, 0, arr.length - 1));

    }
}