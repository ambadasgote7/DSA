package arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = {1,0,1,2};
        int ans = longestConsecutive(arr);
        System.out.println(ans);
    }

    static int longestConsecutive(int[] arr) {
        // Method 3 - Optimal using Set
        int longest = 1 , n = arr.length;
        if (n == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int ele : set) {
            if (!set.contains(ele-1)) {
                int count = 1;
                int x = ele;
                while (set.contains(x+1)) {
                    x = x+1;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;


//        // Method 2 - Better TC - O(N log N)
//        int longest = 1 , n = arr.length;
//        if (n == 0) return 0;
//        Arrays.sort(arr);
//        int lastSmaller = Integer.MAX_VALUE , count = 1;
//        for (int i = 0; i < n; i++) {
//            if (arr[i]-1 == lastSmaller) {
//                lastSmaller = arr[i];
//                count++;
//            } else if (arr[i] != lastSmaller) {
//                count = 1;
//                lastSmaller = arr[i];
//            }
//            longest = Math.max(longest, count);
//        }
//        return longest;

//        // Method 1 - Brute force O(N^2)
//        int longest = 1 , n = arr.length;
//        if (n == 0) return 0;
//        for (int i = 0; i < n; i++) {
//            int x = arr[i], count = 1;
//            while (linearSearch(arr,x+1)) {
//                x = x +1;
//                count++;
//            }
//            longest = Math.max(longest,count);
//        }
//        return longest;
    }

    static boolean linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return true;
        }
        return false;
    }
}
