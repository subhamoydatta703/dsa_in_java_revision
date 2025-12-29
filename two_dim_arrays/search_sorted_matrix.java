package two_dim_arrays;

public class search_sorted_matrix {
    // search key(only true or false) in a sorted matrix(staircase search(optimized)))
    static boolean searchMatrix(int matrix[][], int target){
        int row =0, col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(target<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
               int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.print(searchMatrix(matrix, 18));
    }
}
