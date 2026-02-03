package strings;

public class FindingEachChar {
    // finding each characters of a string using charAt() method
    static void eachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at index: " + i + " is: " + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str1 = "I am a developer.";
        eachChar(str1);
    }
}
