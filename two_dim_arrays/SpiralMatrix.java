package two_dim_arrays;

import java.util.*;

public class SpiralMatrix {
    // using void
    static void spiralMatrix(int matrix[][]) {
        int startrow = 0, startcol = 0, endrow = matrix.length - 1, endcol = matrix[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {

                System.out.print(matrix[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // left
            for (int i = endrow - 1; i > startrow; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();

    }

    // using arraylist
    static List<Integer> spiralMatrixList(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startrow = 0, startcol = 0, endrow = matrix.length - 1, endcol = matrix[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {

                result.add(matrix[startrow][j]);
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                result.add(matrix[i][endcol]);
            }
            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                result.add(matrix[endrow][j]);
            }
            // left
            for (int i = endrow - 1; i > startrow; i--) {
                if (startcol == endcol) {
                    break;
                }
                result.add(matrix[i][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        return result;

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        // spiralMatrix(matrix);
        List<Integer> ans = spiralMatrixList(matrix);
        System.out.print(ans + " ");
    }
}
