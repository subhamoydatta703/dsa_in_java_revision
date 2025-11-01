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

    public static void main(String[] args) {
        System.out.println("This is main()");
        greet();
        
    }
}
