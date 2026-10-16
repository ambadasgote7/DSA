package arrays.Medium;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] ans = merge(arr);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] merge(int[][] arr) {
        // Method 2 - Brute Time Complexity: O(N log N + N), Space Complexity: O(N)
        int n = arr.length;
        Arrays.sort(arr, (first, second) -> Integer.compare(first[0], second[0]));
        if (n <= 1) {
            return arr;
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
                if (list.isEmpty() || list.get(list.size()-1)[1] < arr[i][0]) {
                   list.add(arr[i]);
                } else {
                    list.get(list.size() - 1)[1] =
                            Math.max(list.get(list.size() - 1)[1], arr[i][1]);
                }
        }
        return list.toArray(new int[list.size()][]);

//        // Method 1 - Brute Time Complexity: O(N log N + N2), Space Complexity: O(N)
//        int n = arr.length;
//        Arrays.sort(arr, (first, second) -> Integer.compare(first[0], second[0]));
//        if (n <= 1) {
//            return arr;
//        }
//        List<int[]> list = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            if (!list.isEmpty() && arr[i][1] <= list.get(list.size()-1)[1]) continue;
//            int start = arr[i][0];
//            int end = arr[i][1];
//            for (int j = i+1; j < n; j++) {
//                if (arr[j][0] <= end) {
//                    end = Math.max(end, arr[j][1]);
//                } else {
//                    break;
//                }
//            }
//            list.add(new int[]{start,end});
//        }
//        return list.toArray(new int[list.size()][]);
    }
}
