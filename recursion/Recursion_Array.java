package recursion;

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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 4, 5 };
        System.out.println(isSorted(arr, 0));
        // isSorted(arr, 0);

    }
}
