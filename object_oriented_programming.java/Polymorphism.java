public class Polymorphism {
    public static void main(String[] args) {
        // method overloading
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum(1.5f, 2.5f));
        // System.out.println(calc.sum(1, 2, 3));

        // method overriding
        Dog d1 = new Dog();
        d1.speak();

    }
}

// method overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// method overriding
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}
