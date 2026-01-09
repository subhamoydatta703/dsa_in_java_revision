package strings;

public class sub_string {
    // Displaying a substring(User definded sub string method)
    static String subString(String s, int start, int end) {
        String subStr = "";
        for (int i = start; i < end; i++) {
            subStr += s.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        // System.out.print(subString(str, 0, 5));
        // Built in sub string method of java
        System.out.print(subString(str, 0, 5));

    }
}
