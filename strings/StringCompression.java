package strings;

public class StringCompression {
    static String compress(String chars) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < chars.length(); i++) {
            Integer count = 1;
            while (i < chars.length() - 1 && chars.charAt(i) == chars.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(chars.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcc";
        System.out.print(compress(str));

    }
}
