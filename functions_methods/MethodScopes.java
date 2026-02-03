package functions_methods;

public class MethodScopes {
    // Method Scope
    // Definition:
    // Variables declared inside a method can be accessed only within that method.
    // They are created when the method is called and destroyed when it ends.
    static void num() {
        int n = 5;
        // n is a method scope cause we cannot access this variable n outside of this
        // method
        System.out.print(n + 10);
    }

    public static void main(String[] args) {
        {
            int k = 15;
            // Here, variable k is block scope because we can't access it outside of these
            // curly brackets (block)
            System.out.println("k = " + k);
        }

    }

}
