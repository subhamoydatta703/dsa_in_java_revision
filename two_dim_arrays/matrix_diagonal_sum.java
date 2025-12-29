package two_dim_arrays;

public class matrix_diagonal_sum {
    // brute force
    static int diag_sum(int mat[][]) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    sum += mat[i][j];

                } else if (i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

    // optimized
    static int diagonalSum(int[][] mat) {
        int pd = 0, sd = 0, n = mat.length;
        for (int i = 0; i < n; i++) {
            pd += mat[i][i];
            if (i != n - i - 1) {
                sd += mat[i][n - i - 1];
            }
        }
        return pd + sd;
    }

    // another approach(also optimized)
    static int digSum(int mat[][]) {
        int sum = 0, n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length - i - 1];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }
        };
        // System.out.print(diag_sum(matrix));
        // System.out.print(diagonalSum(matrix));
        System.out.print(digSum(matrix));

    }
}
