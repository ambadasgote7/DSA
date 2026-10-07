package arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class MaxSizeSubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        int ans = subarraySum(arr,3);
        System.out.println(ans);
    }
    public static int subarraySum(int[] arr, int k) {

        // Method 3 - Optimal for positive

        int maxLen = 0, n = arr.length;
        int sum = 0;
        int left = 0, right = 0;

        while (right < n) {
            sum += arr[right];
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;

        // Method 2 - Better for positive array and final optimal for the negative array
//        int maxLen = 0;
//        int sum = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            if (sum == k) {
//                maxLen = Math.max(maxLen, i+1);
//            }
//            int rem = sum - k;
//            if (map.containsKey(rem)) {
//                int len = i - map.get(rem);
//                maxLen = Math.max(maxLen, len);
//            }
//            if (!map.containsKey(sum)) {
//                map.put(sum,i);
//            }
//        }
//        return maxLen;

        // Method 1 - Brute Force

        //        int maxLen = 0;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if (sum == k) {
//                    maxLen = Math.max(maxLen, j-i+1);
//                }
//            }
//        }
//        return maxLen;
    }
}
