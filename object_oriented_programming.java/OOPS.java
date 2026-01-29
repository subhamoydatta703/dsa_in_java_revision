public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("orange");
        p1.setPrice(4.5f);
        // System.out.println(p1.color);
        // System.out.println(p1.price);
        BankAccount user1 = new BankAccount();
        user1.username = "Rahul";
        System.out.println(user1.username);
        user1.setPassword("12345");

    }
}

// Concept of class and objects
class Pen {
    String color;
    float price;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setPrice(float newprice) {
        price = newprice;
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
