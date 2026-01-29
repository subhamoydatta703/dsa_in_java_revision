public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("orange");
        p1.setPrice(4.5f);
        System.out.println(p1.getColor());
        System.out.println(p1.getPrice());
        BankAccount user1 = new BankAccount();
        user1.username = "Rahul";
        System.out.println(user1.username);
        user1.setPassword("12345");

    }
}

// Concept of class and objects
class Pen {
    private String color;
    private float price;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void setPrice(float price) {
        this.price = price;
    }

    float getPrice() {
        return this.price;
    }

}

// Access Modifiers

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pass) {
        password = pass;
    }
}
