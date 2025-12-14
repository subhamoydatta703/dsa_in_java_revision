package arrays;

public class sub_array_sum {

    // sub array sum
    static void subArraySum(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        // int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k < j; k++) {

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

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        subArraySum(arr);
    }

}
