import java.util.*;
public class conditional_stat {

    // Checking a number is positive or negative
    static void checkNum(int n){
        if(n==0){
            System.out.print("It's zero");
        }
        else if(n<0){
            System.out.println("Its a negative number");
        }
        else{
            System.out.print("It's a positive number");
        }

    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the income: ");
        // int num = sc.nextInt();
        // if(num<=1200000){
        //     System.out.print("No tax");
        // }else{
        //     if(num<=1500000){
        //         System.out.println("Your tax will be 20%");
        //         System.out.print("Your tax will be:"+ (num*0.2));

        //     }
        //     else{
        //         System.out.println("Your tax will be 30%");
        //         System.out.print("Your tax will be:"+ (num*0.3));
        //     }
        // }
        // sc.close();

        checkNum(-9);

        
    }
}
