package bit_manipulation;

public class BitwiseOperators {
    public static void main(String[] args) {
        // Binary AND operator -> Symbol -> & -> x & y
        System.out.println("Binary AND operation: " + (5 & 6));
        // Binary OR operator -> Symbol -> ! -> x | y
        System.out.println("Binary OR operation: " + (6 | 5));
        // Binary XOR operator -> Symbol -> ^ -> x ^ y -> here ^ this is the XOR
        // operator symbol
        System.out.println("Binary XOR operation: " + (7 ^ 3));
        // Binary 1's complement -> Symbol -> ~ -> ~x => -(x+1)
        System.out.println("Binary 1's complement: " + (~3));
        // Binary 2's complement -> Symbol -> 1's complement + 1 -> (~x+1) => -x
        System.out.println("Binary 2's complement: " + (~3 + 1));
        // Binary left shift -> Symbol -> << -> x << y => (x*(2^y)) -> here ^ this is
        // the power symbol
        System.out.println("Binary left shift: " + (3 << 2));
        // Binary right shift -> Symbol -> >> -> x >> y => (x/(2^y)) -> here ^ this is
        // the power symbol
        System.out.println("Binary left shift: " + (8 >> 3));

    }
}
