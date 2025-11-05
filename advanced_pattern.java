public class advanced_pattern {

    // hollow rectangle
    static void hollowRectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // inverted hollow pyramid
    static void invertedHollowPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
// inverted half pyramid with numbers
    static void invHalfPyrNum(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // floyd's triangle

    static void floydTriangle(int n){
        int x = 1;
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(x +" ");
                x++;
            }
            System.out.println();
        }
    }

    // 0-11 triangle
    // method 1

    static void bin(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                if((i%2==0 && j%2!=0)||(i%2!=0 && j%2==0)){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }

    // method 2

    static void binTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            if ((i + j) % 2 == 0) {
                System.out.print(1+" ");
            } else {
                System.out.print(0+" ");
            }
        }
        System.out.println();
    }
}

// butterfly pattern

static void butterfly(int n){
    for(int i =1; i<=n; i++){
        // star
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        // space
        for(int j =1 ;j<=2*(n-i); j++){
            System.out.print(" ");
        }
        // star
           for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();

    }
// System.out.println();
    // inverter case
    for(int i =n; i>=1; i--){
        // star
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        // space
        for(int j =1 ;j<=2*(n-i); j++){
            System.out.print(" ");
        }
        // star
           for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();

    }

}

    public static void main(String[] args) {
        // hollowRectangle(4, 5);
        // invertedHollowPyramid(4);
        // invHalfPyrNum(5);
        // floydTriangle(5);
        // bin(5);
        // binTriangle(5);
        butterfly(5);
    }
}
