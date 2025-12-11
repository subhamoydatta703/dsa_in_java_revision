package operators;
import java.util.Scanner;

public class circle_area {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius(in cm): ");
    int r = sc.nextInt();
    System.out.print("The area of the circle is: "+ 3.14*r*r+" cm^2");
    sc.close();
}
}
