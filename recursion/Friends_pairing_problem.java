package recursion;

public class Friends_pairing_problem {

    // for understanding purpose
    // static int friendsPairing(int n){
    // if(n==1 || n==2) return n;

    // int single = friendsPairing(n-1);
    // int pair = friendsPairing(n-2);
    // int pairWays = (n-1)*pair;
    // int totalWays = single + pairWays;
    // return totalWays;
    // }

    // same code but more short and cleaner
    static int friendsPairing(int n) {
        if (n == 1 || n == 2)
            return n;
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
