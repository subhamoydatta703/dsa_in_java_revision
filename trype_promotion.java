public class trype_promotion {
      public static void main(String[] args) {
        // Type promotion happens automatically when smaller data types
        // are used in expressions with larger data types.

        byte a = 10;
        byte b = 20;

        // Here, both 'a' and 'b' are bytes.
        // But during the expression (a + b),
        // Java promotes both 'a' and 'b' to int before performing addition.
        int c = a + b;

        System.out.println("Result (a + b): " + c); // Output: 30

        // Another example: mixing int and float
        int x = 5;
        float y = 6.5f;

        // Here, x (int) is promoted to float automatically
        // before performing the addition.
        float z = x + y;

        System.out.println("Result (x + y): " + z); // Output: 11.5

        // Example with multiple promotions
        byte p = 5;
        char q = 'A'; // 'A' = 65 in ASCII

        // Both p (byte) and q (char) are promoted to int
        int r = p + q;

        System.out.println("Result (p + q): " + r); // Output: 70
    }
}
