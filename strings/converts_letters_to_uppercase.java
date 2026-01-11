package strings;

public class converts_letters_to_uppercase {
    static String upperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
            i++;

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "hello i am A Developer.";
        System.out.println(upperCase(str));
    }
}
