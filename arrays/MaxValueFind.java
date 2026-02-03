package arrays;

public class MaxValueFind {
    // maximum value find in an array
    static void findMax(int arr[]) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                x = arr[i];
            }
        }
        System.out.print("Maximum value is: " + x);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 15, 36, 28 };
        findMax(arr);

    }

}
