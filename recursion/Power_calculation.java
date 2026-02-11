package recursion;

public class Power_calculation {
    // method 1
    static int power(int x, int n) {
        if (n == 0)
            return 1;
        return power(x, n - 1) * x;
    }

    // method 2(optimized)
    static int optPower(int x, int n) {
        if (n == 0)
            return 1;
        int halfVal = optPower(x, n / 2);
        int halfPow = halfVal * halfVal;

        if (n % 2 != 0) {
            halfPow = x * halfPow;
        }

        return halfPow;
    }

    public static void main(String[] args) {
        // System.out.println(power(2, 3));
        System.out.println(optPower(2, 5));
    }
}
