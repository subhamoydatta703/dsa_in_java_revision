import java.util.Scanner;

public class basic_op {    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Calculate sum and product
        int sum = a + b;
        int product = a * b;

        // Display results
        System.out.println("Sum of a and b: " + sum);
        System.out.println("Product of a and b: " + product);

        sc.close(); // Close the scanner
    }
}
