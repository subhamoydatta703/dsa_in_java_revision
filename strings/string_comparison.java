package strings;

public class string_comparison {
    public static void main(String[] args) {
        String s1 = "Hello_World";
        String s2 = "Hello_World";
        String s3 = new String("Hello_World");
        if (s1 == s2) {
            System.out.print("s1 equals to s2");
        } else {
            System.out.print("s1 is not equals to s2");
        }

        System.out.println();

        if (s1 == s3) {
            System.out.print("s1 equals to s3");
        } else {
            System.out.print("s1 is not equals to s3");
        }

        System.out.println();

        if (s1.equals(s2)) {
            System.out.print("Value of s1 is equal to s2");

        } else {
            System.out.print("Value of s1 is NOT equal to s2");
        }

        System.out.println();

        if (s1.equals(s3)) {
            System.out.print("Value of s1 is equal to s3");

        } else {
            System.out.print("Value of s1 is NOT equal to s3");
        }

    }
}
