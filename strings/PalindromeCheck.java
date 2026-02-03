package strings;

public class PalindromeCheck {
    // 1st approach(good)
    static boolean isPalindromeString(String s) {
        int n = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n)) {
                return false;
            }
            n--;
        }
        return true;
    }

    // 2nd approach(better)
    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1, n = s.length();
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;

            }
            l++;
            r--;
        }
        return true;
    }

    // 3rd approach(best)
    static boolean isPalindromeStr(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "MADAM";
        // System.out.print(isPalindrome(str));
        // System.out.println(isPalindromeString(str));
        System.out.println(isPalindromeStr(str));

    }
}
