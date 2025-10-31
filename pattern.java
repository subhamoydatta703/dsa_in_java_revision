public class pattern {

    // star print
    static void star(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // inverted star print
    static void invStar(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invStar(5);
    }
}
