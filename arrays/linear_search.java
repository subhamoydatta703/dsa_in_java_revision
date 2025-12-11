package arrays;
import java.util.*;

public class linear_search {

    // linear search by using value
    static void linSearchByVal(int x, int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("Index: " + i + " , Value: " + x);
                return;
            }
        }
        System.out.println("Not found");
    }


    // linear search by using index
    static void linSearchByIndx(int y, int arr[]){
        if(y>=arr.length || y<0){
            System.out.print("Index should be within 0 to "+(arr.length-1));
            return;
        }
        for(int i =0; i <arr.length; i++){
            if( i ==y){
                System.out.print("Value is: "+ arr[i]+" at index: "+ y);
            return;
            }
            
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 8, 9};
        // linSearchByVal(9, arr);
        linSearchByIndx(3, arr);
    }
}
