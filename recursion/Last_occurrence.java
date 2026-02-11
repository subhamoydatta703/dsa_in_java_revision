package recursion;

public class Last_occurrence {
    // last occurrence of an element in an array
    // method 1
    static int lastOcc(int[] arr, int i, int k) {
        if (i == arr.length) {
            return -1;
        }

        int idx = lastOcc(arr, i + 1, k);

        if (idx != -1) {
            return idx;
        }

        if (arr[i] == k) {
            return i;
        }

        return -1;
    }

    // method 2
    static int lastOcc2(int[] arr, int i, int k) {
        if (i < 0)
            return -1;
        if (arr[i] == k)
            return i;
        return lastOcc2(arr, i - 1, k);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 5, 2 };
        int idx = lastOcc(arr, 0, 2);
        // System.out.println(idx == -1 ? "Not find" : "Last index: " + idx);
        int i = lastOcc2(arr, arr.length - 1, 5);
        System.out.println(i);

    }
}
