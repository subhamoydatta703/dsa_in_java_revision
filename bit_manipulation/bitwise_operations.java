package bit_manipulation;

public class bitwise_operations {
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
        //  if ((result & (1 << i)) != 0) {
        // System.out.print("ith bit is: " + 1);
        // } else {
        // System.out.print("ith bit is: " + 0);
        // }
        // clear the ith bit
        // steps to clear the ith bit of x -> (x & (~(1 << i)))
        // For x = 18 and i = 3
        int n = 18;
        int i = 3;
        int result = (n & (~(1 << i)));
        System.out.println("Result: " + result);
         if ((result & (1 << i)) != 0) {
        System.out.print("ith bit is: " + 1);
        } else {
        System.out.print("ith bit is: " + 0);
        }

    }
}
