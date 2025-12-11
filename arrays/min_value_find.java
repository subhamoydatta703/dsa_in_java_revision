package arrays;

public class min_value_find {

    // find minimum value in an array
    static void findMin(int arr[]) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                x = arr[i];
            }
        }
        System.out.print("Minimum value is: " + x);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 15, 36, 28 };
        findMin(arr);
    }
}
