public class pattern {

    // star print
    static void star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // inverted star print
    static void invStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // half pyramid with numbers
    static void halfPyr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // character pattern
    static void charPat(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    // hollow rectangle
    static void hollowRectanglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (i == 1 || i == n || j == 1 || j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // inverted half pyramid with numbers
    static void invHalfPyrNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= (i - 1); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Floyd's triangle
    static void floydTriangle(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    // binary 0-1 triangle
    static void binTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 != 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }

    // butterfly pattern
    static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k <= (2 * (n - i)); k++)
                System.out.print(" ");
            for (int l = 1; l <= i; l++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k <= (2 * (n - i)); k++)
                System.out.print(" ");
            for (int l = 1; l <= i; l++)
                System.out.print("*");
            System.out.println();
        }
    }

    // solid rhombus
    static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++)
                System.out.print(" ");
            for (int k = 1; k <= n; k++)
                System.out.print("*");
            for (int l = 1; l <= (i - 1); l++)
                System.out.print(" ");
            System.out.println();
        }
    }

    // inverted & rotated half pyramid
    static void invertedRotatedHalfPyr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    // hollow rhombus

    static void hollowRhombus(int n) {
        // lines
        for (int i = 1; i <= n; i++) {
            // space
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // star(hollow rectangle code)
            for (int j = 1; j <= n + 1; j++) {
                if (i == 1 || i == n || j == 1 || j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    // diamond pattern

    static void duamondPattern(int n){
        // lines
        for(int i =1; i<=n; i++){
            // space
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // star
            for(int k = 1; k<=((2*i)-1); k++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        // lines
        for(int i =n; i>=1; i--){
            // space
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // star
            for(int k = 1; k<=((2*i)-1); k++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // solidRhombus(5);
        // hollowRhombus(5);
        duamondPattern(5);
    }
}
