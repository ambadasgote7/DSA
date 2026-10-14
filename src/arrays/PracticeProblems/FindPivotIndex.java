package arrays.PracticeProblems;

import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int ans = pivotIndex(arr);
        System.out.println(ans);
    }
    public static int pivotIndex(int[] arr) {
        // Method 4 - Optimal , Tc- O(2n) & SC - O(1)
        int n = arr.length;
        int totalSum = 0;
        int leftSum = 0;
        for (int ele : arr) {
            totalSum += ele;
        }
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) return i;
            leftSum += arr[i];
        }
        return -1;

//        // Method 3 - Better Tc - (2n) & SC - o(n)
//        int n = arr.length;
//        int[] rightSum = new int[n];
//        for (int i = n-2; i >= 0; i--) {
//            rightSum[i] = rightSum[i+1]+ arr[i+1];
//        }
//        int leftSum = 0;
//        for (int i = 0; i < n; i++) {
//            if (leftSum == rightSum[i]) {
//                return i;
//            }
//            leftSum +=  arr[i];
//        }
//        return -1;

//        // Method 2 - Better TC - O(3n), SC - O(2n)
//        int n = arr.length;
//        int[] leftSum = new int[n];
//        int[] rightSum = new int[n];
//        for (int i = 1; i < n; i++) {
//            leftSum[i] = leftSum[i-1]+ arr[i-1];
//        }
//        for (int i = n-2; i >= 0; i--) {
//            rightSum[i] = rightSum[i+1] + arr[i+1];
//        }
//        for (int i = 0; i < n; i++) {
//            if (leftSum[i] == rightSum[i]) return i;
//        }
//        return -1;


        // // Method 1 - Brute Force TC - O(n^2) SC - O(1)
//       int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int leftSum = 0;
//            int rightSum = 0;
//            for (int j = 0; j < i; j++) {
//                leftSum += arr[j];
//            }
//            for (int j = i+1; j < n; j++) {
//                rightSum += arr[j];
//            }
//            if (leftSum == rightSum) {
//                return i;
//            }
//        }
//        return -1;
    }
}
