package two_dim_arrays;

import java.util.Scanner;

public class matrices {
    // search in 2d array
    static boolean isFind(int arr[][], int key){
        int n = arr.length, m= arr[0].length;
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==key){
                    System.out.print("Found at index: ("+(i+1)+", "+(j+1)+")");
                    return true;
                }
            }
        }
        return false;
    }
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
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.print(isFind(matrix, 10));

    }
}
