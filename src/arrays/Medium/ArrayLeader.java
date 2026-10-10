package arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeader {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        List<Integer> ans = arrayLeader(arr);
        System.out.println(ans);
    }
    public static List<Integer> arrayLeader(int[] arr) {
        // Method 2 - Optimal TC - O(N) & SC - O(N) , IF ans in sorted TC - O(N log N)
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans.reversed();


//        // Method 1 - Brute Force TC - O(N^2) & SC - O(N)
//        int n = arr.length;
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            boolean flag = true;
//            for (int j = i+1; j < n; j++) {
//                if (arr[i] < arr[j]) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) ans.add(arr[i]);
//        }
//        return ans;
    }
}
