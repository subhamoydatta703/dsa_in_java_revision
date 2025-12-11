package arrays;

public class binary_search {
    // binary search
    static void binSearch(int key, int arr[]) {
        int start = 0;
        int end = (arr.length - 1);
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("Index: " + mid);
                return;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

    }

    public static void main(String[] args) {
        // need a sorted array for the binary search
        int arr[] = { 10, 20, 30, 40, 50 };
        binSearch(50, arr);
    }
}
