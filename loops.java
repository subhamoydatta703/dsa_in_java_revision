public class loops {

    static int fac(int n){
        if(n==0 || n==1){
            return 1;
        }
        return fac(n-1)*n;
    }
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello");
        // i += 2;
        // }

        // int arr[]= new int[5];
        // int[] arr;
        // int arr[] = {1, 2, 3, 4, 5};

        // int arr[] = { 1, 2, 3, 4, 5 };
        // int sumOdd = 0, sumEven = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] % 2 == 0) {
        //         sumEven += arr[i];

        //     } else {
        //         sumOdd += arr[i];
        //     }
        // }
        // System.out.print("Sum of evens: " + sumEven);
        // System.out.println();
        // System.out.print("Sum of odds: " + sumOdd);
        System.out.print(fac(4));
    
    }
}
