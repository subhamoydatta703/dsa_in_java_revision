package strings;

import java.util.Scanner;

public class string_intro {
    public static void main(String[] args) {
        // array of characters
        int[] ch = {'a','b','c','d'};
        // string declare(method 1)
        String str1 = "abcdef";
        // string declare(method 2: with new keyword)
        String str2 = new String("ghijkl");
        // String is a built-in class in java for Strings
        // Strings are immutable(can not modify the original string)

        // USing input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // next() -> not allows words/letters after space
        String name = sc.next();
        // nextLine() -> allows words/letters after space until press enter
        // String name = sc.nextLine(); 
        System.out.print("Hello "+name);
    }
}
