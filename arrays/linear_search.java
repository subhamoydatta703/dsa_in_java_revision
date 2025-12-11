package arrays;
import java.util.*;

public class linear_search {

    static void findVal(int x, int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("Index: " + i + " , Value: " + x);
                return;  // exit function after finding
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 8, 9};
        findVal(9, arr);
    }
}
