package arrays.Medium;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSumInSubArray(arr);
        System.out.println(ans);
    }

    static int maxSumInSubArray(int[] arr) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;

        /// ----------------------------
//        int maxSum = Integer.MIN_VALUE;
//        int sum = 0;
//        int s = 0, e = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int start = 0;
//            if (sum == 0) {
//                start = i;
//            }
//            sum += arr[i];
//            if (sum > maxSum) {
//                maxSum = sum;
//                s = start; e = i;
//            }
//
//            if (sum < 0) {
//                sum = 0;
//            }
//        }
//        printSub(arr, s, e);
//        return maxSum;
    }
    static void printSub(int[] arr, int s, int e) {
        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
