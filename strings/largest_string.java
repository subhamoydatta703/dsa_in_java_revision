package strings;

public class largest_string {
    // finding largest string
    static String largestString(String s[]) {
        String largest = s[0];
        for (int i = 1; i < s.length; i++) {
            if (largest.compareToIgnoreCase(s[i]) < 0) {
                largest = s[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mango", "guava", "kiwi" };
        System.out.print(largestString(fruits));
    }
}
