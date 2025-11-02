import java.util.*;
public class functions_methods {
    // call stack

    static void name() {
        System.out.println("This is name()");
        System.out.println("Your name");
    }

    static void greet() {
        System.out.println("This is greet()");
        System.out.println("Hello");
        name();
    }

    // products of 2 numbers
    static void prod(int x, int y) {
        System.out.print(x * y);
    }

    // factorial using loop
    static int fac(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // prime number check

    static void primeNum(int n) {
        if (n <= 1) {
            System.out.print("Not Prime");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(" Not Prime");
                return;
            }
        }
        System.out.print("Prime");
    }

    // optimized prime number check

static boolean optPrime(int n) {
    if (n < 2) {
        return false; // 0 and 1 are not prime
    }
    if (n == 2) {
        return true;  // 2 is prime
    }
    // No even number > 2 is prime
    if (n % 2 == 0) {
        return false;
    }

    // Check divisibility from 3 up to sqrt(n)
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

    // Binomial coefficient

    static int binCoeff(int n, int r) {
        int facN = fac(n);
        int facR = fac(r);
        int x = (n - r);
        int down = facR * fac(x);
        return facN / down;
    }

    // function(method in java) overloading

    // Method 1: Adds two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two double values
    static double add(double a, double b) {
        return a + b;
    }
    
// primes in range 2 to 10
static void primeRan(int n){
    System.out.print("Prime numbers from 2 to "+ n+ " are: ");
    for(int i =2; i<=n; i++ ){
        if(optPrime(i)){
            System.out.print(+i+" ");
        }
    }
}

// binary to decimal

static void btd(int bin){
    int pow =0;
    int dn=0;
    while(bin>0){
        int ld = bin%10;
        dn = dn +(ld*(int)Math.pow(2, pow));
        pow++;
        bin=bin/10;
    }
    System.out.print(dn);

}

    public static void main(String[] args) {
        // System.out.println("This is main()");
        // greet();
        // prod(2,3);
        // System.out.print(fac(4));
        // System.out.print(binCoeff(5, 2));
        // // primeNum(7);
        // System.out.println("Sum of 2 ints: " + add(5, 10));
        // System.out.println("Sum of 3 ints: " + add(5, 10, 15));
        // System.out.println("Sum of 2 doubles: " + add(5.5, 10.2));
        // String name = "Subhamoy";
        // System.out.println(name.charAt(0)); 
        // primeRan(10);
        btd(1011);

    }
}
