package arrays.PracticeProblems;

import java.util.Arrays;

public class ScoreOfAllPrefixes {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,8,16};
        long[] ans = findPrefixScore(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static long[] findPrefixScore(int[] arr) {
        // Method 3 - Better TC - O(N) & SC-O(N) only for returning
        int n = arr.length;
        long[] conver = new long[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            conver[i] = arr[i] + max;
        }
        for (int i = 1; i < n; i++) {
            conver[i] = conver[i-1] + conver[i];
        }
        return conver;



//        // Method 2 - Better TC - O(N) & SC-O(2N)
//        int n = arr.length;
//        long[] conver = new long[n];
//        int max = arr[0];
//        for (int i = 0; i < n; i++) {
//           if (arr[i] > max) max = arr[i];
//            conver[i] = arr[i] + max;
//        }
//        System.out.println(Arrays.toString(conver));
//        long[] ans = new long[n];
//        ans[0] = conver[0];
//        for (int i = 1; i < n; i++) {
//            ans[i] = ans[i-1] + conver[i];
//        }
//        return ans;
//

        //Method 1 - Brute , TC - O(N^2) & SC - O(2N)
//        int n = arr.length;
//        long[] conver = new long[n];
//        for (int i = 0; i < n; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = 0; j <= i; j++) {
//                max = Math.max(arr[j], max);
//            }
//            conver[i] = arr[i] + max;
//        }
//        System.out.println(Arrays.toString(conver));
//        long[] ans = new long[n];
//        ans[0] = conver[0];
//        for (int i = 1; i < n; i++) {
//            ans[i] = ans[i-1] + conver[i];
//        }
//        return ans;
    }
}
