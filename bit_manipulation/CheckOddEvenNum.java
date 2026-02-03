package bit_manipulation;

public class CheckOddEvenNum {
    static void checkOddEven(int num) {
        // any even number & 1 = 0 => 2= 010 & 001 = 000
        if ((num & 1) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        checkOddEven(8);
    }
}
