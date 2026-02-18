package recursion;

public class Binary_search {
    static int binSearch(int[] arr, int t, int s, int e) {
        if (s > e)
            return -1;
        int m = s + ((e - s) / 2);
        if (arr[m] == t)
            return m;
        else if (t > arr[m])
            return binSearch(arr, t, m + 1, e);
            else{
        return binSearch(arr, t, s, m - 1);}
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 9, 66, 89 };
        System.out.print(binSearch(arr, 9, 0, arr.length-1));

    }
}
