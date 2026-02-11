package recursion;

public class First_occurrence {
    // first occurrence of an element in an array
    // method 1
    static void firstOcc(int[] arr, int i, int k) {
        boolean find = false;
        if (i == (arr.length)) {
            System.out.println("Not find");
            return;
        }
        if (arr[i] == k) {
            find = true;
            System.out.println("Find at index: " + i);
            return;
        }
        firstOcc(arr, i + 1, k);

    }

    // method 2
    static int firstOcc2(int arr[], int idx, int target) {
        if (idx == arr.length)
            return -1;
        if (arr[idx] == target)
            return idx;
        return firstOcc2(arr, idx + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // firstOcc(arr, 0, 7);
        int res = firstOcc2(arr, 0, 4);
        if (res == -1)
            System.out.println("Not find");
        else
            System.out.println("Find at index: " + res);
    }
}
