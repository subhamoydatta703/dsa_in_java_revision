package recursion;

public class Binary_string_problem {

    static void binStringProb(int n, int lastDig, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binStringProb(n - 1, 0, str + "0");
        if (lastDig == 0)
            binStringProb(n - 1, 1, str + "1");
    }

    public static void main(String[] args) {
        binStringProb(3, 0, "");
    }
}
