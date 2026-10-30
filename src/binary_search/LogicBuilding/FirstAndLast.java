package binary_search.LogicBuilding;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 10;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] arr, int target) {
        // Method 3 -
        int n = arr.length;
//        int[] ans = {-1,-1};
        int fp = -1;
        int low = 0, high = n-1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (arr[mid] >= target) {
                if (arr[mid] == target)  fp = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        if (fp == -1) return new int[]{-1,-1};

        // Find last position using upper bound - 1 index
        int lp = n;
        low = 0; high = n-1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (arr[mid] > target) {
                lp = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return new int[]{fp, lp-1};

//        // Method 2 -
//        int n = arr.length;
//        // Find is target is present or not
//        boolean flag = false;
//        int low = 0, high = n-1;
//        while (low <= high) {
//            int mid = low + (high-low) / 2;
//            if (arr[mid] == target) {
//                flag = true;
//                break;
//            } else if (arr[mid] > target) {
//                high = mid-1;
//            } else {
//                low = mid+1;
//            }
//        }
//        if (!flag) return new int[]{-1,-1};
//        // Find first position using lower bound code
//        int fp = -1;
//        low = 0; high = n-1;
//        while (low <= high) {
//            int mid = low + (high-low) / 2;
//            if (arr[mid] >= target) {
//                fp = mid;
//                high = mid-1;
//            } else {
//                low = mid+1;
//            }
//        }
//
//        // Find last position using upper bound - 1 index
//        int lp = n;
//        low = 0; high = n-1;
//        while (low <= high) {
//            int mid = low + (high-low) / 2;
//            if (arr[mid] > target) {
//                lp = mid;
//                high = mid-1;
//            } else {
//                low = mid+1;
//            }
//        }
//
//        return new int[]{fp, lp-1};

        // Method 1 -
//        int n = arr.length;
//        int[] ans = {-1,-1};
//        for (int i = 0; i < n; i++) {
//           if (i > 0 && arr[i] == target && arr[i-1] < target) {
//                ans[0] = i;
//            } else if (i < n-1 && arr[i] == target && arr[i+1] > target) {
//               ans[1] = i;
//           }
//        }
//        return ans;
    }
}
