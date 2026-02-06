package recursion;

public class Recursion_basics1 {

    // print numbers from n to 1(in decreasing manner)
    static void nToOne(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        nToOne(n - 1);

    }

    // print numbers from 1 to n(in increasing manner)
    static void oneTon(int n) {
        if (n == 0)
            return;
        oneTon(n - 1);
        System.out.print(n + " ");

    }

    // factorial
    static int fact(int n) {
        if (n == 0)
            return 1;
        return fact(n - 1) * n;
    }

    // sum of n natural numbers
    static int sumOfNatNum(int n) {
        if (n == 1)
            return 1;
        return n + sumOfNatNum(n - 1);
    }

    // fibonacci of n
    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // checking array is sorted or not

    static boolean isSorted(int[] arr, int i) {
        if ((arr.length - 1) == i)
            return true;
        if (arr[i] > arr[i + 1])
            return false;
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5 };
        // nToOne(10);
        // oneTon(5);
        // System.out.print(fact(4));
        // System.out.println(sumOfNatNum(5));
        // System.out.print(fib(16));
        System.out.println(isSorted(arr, 0));
    }
}
