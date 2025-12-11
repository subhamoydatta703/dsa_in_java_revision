package conditional_statements;
import java.util.*;

public class conditional_stat {

    // Checking a number is positive or negative
    static void checkNum(int n) {
        if (n == 0) {
            System.out.print("It's zero");
        } else if (n < 0) {
            System.out.println("Its a negative number");
        } else {
            System.out.print("It's a positive number");
        }

    }

    static void feverCheck(double n) {
        if (n != 0 && n > 95) {
            if (n >= 100) {
                System.out.print("You have fever");
            } else {
                System.out.print("You dont have fever");
            }
        } else if (n == 0) {
            System.out.print("Error");
        } else {
            System.err.print("Check the value again");
        }
    }

    static void weekCheck(int d) {
        if(d>0 && d<=7){
        switch (d) {
            case 1:
                System.out.print("Sunday");

                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
        }}
        else{
            System.out.print("Enter values from 1 to 7 only");
        }

        }
    
        static void leapYear(int y){
            if(y%400==0 ){
                System.out.print("Leap Year");
            }else if(y%100==0){
                System.out.print("Not  Leap Year");
            }else if(y%4==0){
                System.out.print("Leap Year");
            }else{
                System.out.print("Not Leap Year");
            }
        }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the income: ");
        // int num = sc.nextInt();
        // if(num<=1200000){
        // System.out.print("No tax");
        // }else{
        // if(num<=1500000){
        // System.out.println("Your tax will be 20%");
        // System.out.print("Your tax will be:"+ (num*0.2));

        // }
        // else{
        // System.out.println("Your tax will be 30%");
        // System.out.print("Your tax will be:"+ (num*0.3));
        // }
        // }
        // sc.close();

        // checkNum(-9);

        // feverCheck(96);
        // weekCheck(4);
        // int a=63,b=36;
        // boolean x= (a<b)?true:false;
        // int y= (a>b)?a:b;
        // System.out.println(x);
        // System.out.println(y);

        leapYear(2017);
    }
}
