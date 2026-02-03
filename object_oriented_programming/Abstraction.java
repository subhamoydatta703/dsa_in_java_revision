package object_oriented_programming;

public class Abstraction {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.speak();
        d1.eat();
        c1.speak();
        c1.eat();
    }
}


abstract class Animal{
     void eat(){
        System.out.println("eats");
     }
     abstract void speak();
}

class Dog extends Animal{
    void speak(){
        System.out.println("barks");
    }
    void eat(){
        System.out.println("eats bones");
    }
}

class Cat extends Animal{
    void speak(){
        System.out.println("meows");
    }
}

