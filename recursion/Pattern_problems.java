package recursion;

public class Pattern_problems {
    static void invTriangle(int n, int i) {
        if (i > n)
            return;
        for (int j = 1; j <= (n - i + 1); j++) {
            System.out.print("* ");
        }
        System.out.println();
        invTriangle(n, i + 1);
    }

    static void triangle(int n, int i) {
        if (i > n)
            return;
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
        triangle(n, i + 1);
    }

    static void rightAlignTriangle(int n, int i) {
        if (i > n)
            return;
        for (int j = 1; j <= (n - i); j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }
        System.out.println();
        rightAlignTriangle(n, i + 1);
    }

    static void revNumTriange(int n, int i) {
        int count = 1;
        if (i > n)
            return;
        for (int j = 1; j <= (n - i + 1); j++) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        revNumTriange(n, i + 1);
    }

    static void numIncreaseTriange(int n, int i) {
        int count = 1;
        if (i > n)
            return;
        for (int j = 1; j <= i; j++) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        numIncreaseTriange(n, i + 1);
    }

    public static void main(String[] args) {
        // invTriangle(4, 1);
        // triangle(5, 1);
        // revNumTriange(5, 1);
        // numIncreaseTriange(5, 1);
        rightAlignTriangle(5, 1);

    }
}
