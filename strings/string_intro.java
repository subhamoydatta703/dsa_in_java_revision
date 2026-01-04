package strings;

import java.util.Scanner;

public class string_intro {
    public static void main(String[] args) {
        // array of characters
        int[] ch = { 'a', 'b', 'c', 'd' };
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
        System.out.print("Hello " + name);
        sc.close();

        // length of a string check

        // method 1-> by using a loop
        String s = "Code";
        int count = 0;
        for (char c : s.toCharArray()) {
            count++;
            System.out.println(c);
        }

        System.out.println("Length = " + count);
        // method 2 -> using build in method -> str.length();
        String str = "Java";
        System.out.print("String length: " + str.length());
    }
}
