package arrays;

public class sub_array_sum {

    // sub array sum by bruteforce
    static void bruteForceSubArraySum(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        // int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {

                    currSum += arr[k];

                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }


    // prefix sub array sum
    static void prefixSubArraySum(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        // calculation of prefix sum
        prefix[0]= arr[0];
        for(int a =1; a<prefix.length;a++){
            prefix[a]= prefix[a-1]+arr[a];
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i==0 ?  prefix[j] : prefix[j]-prefix[i-1];
                 if (currSum > maxSum) {
                maxSum = currSum;
            }
                // System.out.println();
            }
            
            // System.out.println();
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        // bruteForceSubArraySum(arr);
        prefixSubArraySum(arr);
    }

}
