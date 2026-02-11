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

    // method 3(handling negative powers also)
    static double pow(double x, int n){
    if(n == 0) return 1;

    double half = pow(x, n/2);

    if(n % 2 == 0)
        return half * half;
    else if(n > 0)
        return x * half * half;
    else
        return (half * half) / x;
}


    public static void main(String[] args) {
        // System.out.println(power(2, 3));
        // System.out.println(optPower(2, 5));
        System.out.println(pow(2, -1));
    }
}
