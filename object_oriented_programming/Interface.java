package object_oriented_programming;

public class Interface {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        Person p1 = new Person();
        p1.eat();
        p1.sleep();
        p1.walk();
        p1.breathe();
    }
}

interface Animal {
    void eat();

    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

// Multiple Inheritance
interface Human extends Animal {
    void walk();
}

interface Mammal extends Animal {
    void breathe();
}

class Person implements Human, Mammal {
    public void eat() {
        System.out.println("Human eats");
    }

    public void sleep() {
        System.out.println("Human sleeps");
    }

    public void walk() {
        System.out.println("Human walks");
    }

    public void breathe() {
        System.out.println("Human breathes");
    }
}
