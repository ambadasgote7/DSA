package arrays.PracticeProblems;
import java.util.*;

public class Practice04 {
    public static void main(String[] args) {
        int[] arr = {94, -33, -13, 40, -82, 94, -33, -13, 40, -82};
        int ans = longestSubarray(arr, 52);
        System.out.println(ans);
    }


    // Lonest Subarray with sum 0
    static  int maxLength(int[] arr) {
        int n = arr.length, sum = 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLen = Math.max(maxLen, i+1);
            }

            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen,len);
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length, sum = 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;

    }
}
