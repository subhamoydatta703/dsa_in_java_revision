public class functions_methods {
    // call stack

    static void name(){
        System.out.println("This is name()");
        System.out.println("Your name");
    }
    static void greet(){
        System.out.println("This is greet()");
        System.out.println("Hello");
        name();
    }

    // products of 2 numbers
    static void prod(int x, int y){
        System.out.print(x*y);
    }

    // factorial using loop
    static int fac(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // System.out.println("This is main()");
        // greet();
        // prod(2,3);
        // System.out.print(fac(4));
        
    }
}
