package arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    public static int majorityElement(int[] arr) {
        // Method 3 - Using TC o(n) & SC o(1)
        int ele = 0;
        int count = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            if (count==0) {
                count++;
                ele = arr[i];
            } else if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) count1++;
        }
        if (count1 > n/2) return ele;
        else return -1;

        // Method 2 - Better using TC & SC O(n)
//        int n = arr.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//        }
//        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
//            if (entry.getValue() > n/2) {
//                return entry.getKey();
//            }
//        }
//        return -1;

//        // Method 1 - Brute Force using O(n log n)
//        Arrays.sort(arr);
//        return arr[arr.length/2];
    }
}
