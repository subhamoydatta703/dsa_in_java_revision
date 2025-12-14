package arrays;

public class sub_array_sum {

    // sub array sum by bruteforce
    static void bruteForceSubArraySum(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
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
        int prefix[] = new int[arr.length];
        // calculation of prefix sum
        prefix[0] = arr[0];
        for (int a = 1; a < prefix.length; a++) {
            prefix[a] = prefix[a - 1] + arr[a];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println(maxSum);
    }

    // Kadane's algorithm for max sub array sum
    static void kadaneSubArraySum(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        if (maxSum == 0) {
            int max = arr[0];
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            maxSum = max;
        }
        System.out.print(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };

        kadaneSubArraySum(arr);
    }

}
