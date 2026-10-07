package arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] ans = twoSum(arr, 9);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}
