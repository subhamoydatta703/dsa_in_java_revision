package object_oriented_programming;

public class Super_keyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.color);
    }
}


class Animal {
    String color;
    Animal(){
System.out.println("Animal constructor");
    }
    
}

class Dog extends Animal{
    Dog(){
        super.color = "Brown";
        System.out.println("Dog class");
    }
}