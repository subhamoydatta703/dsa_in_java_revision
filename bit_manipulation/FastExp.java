package bit_manipulation;

public class FastExp {
    static double fastExp(double x, long n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= x;
            }
            x *= x;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(fastExp(2, -4));
    }
}
