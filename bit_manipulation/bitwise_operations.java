package bit_manipulation;

public class bitwise_operations {
    // update the ith bit using normal conditional statements
    static void updateBit(int n, int i) {

        if ((n & (1 << i)) == 0) {
            n = n | (1 << i);
        } else {
            n = n & ~(1 << i);
        }

        System.out.println(n);

    }

    // update the ith bit using XOR operator(preferred)
    static void updateBitByXOR(int n, int i) {

        n = n ^ (1 << i);

        System.out.println(n);
    }

    // clear the last i bits
    static void clearLastBit(int n, int i) {
        // formula to clear the last i bits -> n = n & (~((1 << i) - 1))
        n = n & (~((1 << i) - 1));

        System.out.println(n);

    }

    // clear range of bits
    static void clearRangeBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = ((1 << i) - 1);
        int result = (n & (a | b));
        System.out.print(result);
    }

    // check number is power of 2 or not
    static boolean isPowTwo(int n) {
        return (n & (n - 1))==0;
    }

    public static void main(String[] args) {
        // get the ith bit
        // steps to get the ith bit of x -> (x & (1 << i))
        // For n = 15 and i = 2
        // int n = 15;
        // int i = 2;
        // if ((n & (1 << i)) != 0) {
        // System.out.print("2nd bit of 15 is: " + 1);
        // } else {
        // System.out.print("2nd bit of 15 is: " + 0);
        // }
        // set the ith bit
        // steps to set the ith bit of x -> (x | (1 << i))
        // For x = 12 and i = 4
        // int n = 12;
        // int i = 4;
        // int result = (n | (1 << i));
        // System.out.println("Result: " + result);
        // if ((result & (1 << i)) != 0) {
        // System.out.print("ith bit is: " + 1);
        // } else {
        // System.out.print("ith bit is: " + 0);
        // }
        // clear the ith bit
        // steps to clear the ith bit of x -> (x & (~(1 << i)))
        // For x = 18 and i = 3
        // int n = 18;
        // int i = 3;
        // int result = (n & (~(1 << i)));
        // System.out.println("Result: " + result);
        // if ((result & (1 << i)) != 0) {
        // System.out.print("ith bit is: " + 1);
        // } else {
        // System.out.print("ith bit is: " + 0);
        // }
        // updateBit(10, 2);
        // updateBitByXOR(12, 4);
        // clearLastBit(12, 3);
        // clearRangeBits(15, 2, 4);
        System.out.println(isPowTwo(16));

    }
}
