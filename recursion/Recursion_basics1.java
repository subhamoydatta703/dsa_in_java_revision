package recursion;

public class Recursion_basics1 {

    // print numbers from n to 1(in decreasing manner)
    static void nToOne(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");
        ;
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

    public static void main(String[] args) {
        // nToOne(10);
        // oneTon(5);
        // System.out.print(fact(4));
        System.out.println(sumOfNatNum(5));
    }
}
