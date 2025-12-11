package arrays;

public class reverse_array {
    // show array elements
    static void showArrayElements(int arr[]) {
        System.out.print("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // reverse an array
    static void revArray(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9 };
        revArray(arr);
        showArrayElements(arr);
    }
}
