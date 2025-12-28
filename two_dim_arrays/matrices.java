package two_dim_arrays;

import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the value of row: "+(i+1)+" and Column: "+(j+1)+" : ");
                matrix[i][j]= sc.nextInt();
            }
        
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
