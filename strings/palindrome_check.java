package strings;

public class palindrome_check {
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
    // 2nd approach
    static boolean isPalindromeString(String s){
        int n=s.length()-1;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(n)){
                return false;
            }
            n--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "MADAM";
        // System.out.print(isPalindrome(str));
        System.out.println(isPalindromeString(str));
    }
}
