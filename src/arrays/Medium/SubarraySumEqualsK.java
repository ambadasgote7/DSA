package arrays.Medium;

import java.util.*;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {3,-3,1,1,1};
        int ans = subarraySum(arr,3);
        System.out.println(ans);
    }
    public static int subarraySum(int[] arr, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
//          if (sum == k) {
//              count++;
//
//          }
          int rem = sum - k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(map);

        return count;

//        // Method 1 - Brute Force // 1563ms
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if (sum == k) count++;
//            }
//        }
//        return count;
    }
}
