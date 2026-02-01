public class Inheritance {
    public static void main(String[] args) {
        // single inheritance
        //

        // multi level inheritance
        // Dog d1 = new Dog();
        // d1.bark();
        // d1.eat();
        // d1.walk();

        // hierarchical inheritance
        Fish f1 = new Fish();
        Bird b1 = new Bird();
        Mammal m1 = new Mammal();
        f1.swim();
        f1.eat();
        b1.fly();
        b1.eat();
        m1.walk();
        m1.eat();

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void sleep() {
        System.out.println("sleeps");
    }

}

// single level inheritance
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims");
    }

    void setColor(String color) {
        this.color = color;

    }

    void getColor() {
        System.out.println(this.color);
    }
}

// multi level inheritance
class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammal {
    String breed;

    void setBreed(String breed) {
        this.breed = breed;
    }

    void getBreed() {
        System.out.println(this.breed);
    }

    void bark() {
        System.out.println("barks");
    }
}

// hierarchical inheritance
// parent class is Animal -> 2 child classes are Fish, bird and Mammal
class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}
