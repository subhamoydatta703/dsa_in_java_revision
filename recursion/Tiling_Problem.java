package recursion;

public class Tiling_Problem {
    static int tilingProblem(int n) {
        if (n == 0 || n == 1)
            return 1;
        int verticalFill = tilingProblem(n - 1);
        int horizontalFill = tilingProblem(n - 2);
        int totalWays = verticalFill + horizontalFill;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
