package arrays.PracticeProblems;
import java.util.*;

public class Practice01 {
    public static void main(String[] args) {
        int[] arr = {10,10,10,10,100,119};
        int[] brr = {4,10,10,11,119};
        int target = 3;
//        System.out.println(findMaxConsecutiveOnes(arr));
        System.out.println(Arrays.toString(intersectionArray(arr,brr)));
    }
    public static int[] intersectionArray(int[] arr, int[] brr) {
        List<Integer> list = new ArrayList<>();
        int m = arr.length, n = brr.length;
        int i = 0, j = 0;
        while (i<m && j<n) {
            if (arr[i] < brr[j]) {
                i++;
            } else if (arr[i] > brr[j]) {
                j++;
            } else {
                    list.add(arr[i]);
                i++;j++;
            }
            if (i >= m || j >= n) break;
        }
        int[] ans = new int[list.size()];
        for (i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int i = 0, max = 0;
        int count = 0;
        while (i < n) {
            if (arr[i] == 1) {
                i++;count++;
                max = Math.max(max,count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static int secondLargestElement(int[] arr) {
        // Method 2 -
        if (arr.length < 2) {
            return -1;
        }
        int large = arr[0];
        int sLarge = 0;
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (current > large) {
                sLarge = current;
                large = current;
                flag = true;
            } else if (current < large) {
                if (!flag || current > sLarge) {
                    sLarge = current;
                    flag = true;
                }
            }

        }
        return flag ? sLarge : -1;

        // Method 1 - Brute TC - O(2n), SC - O(1)
//        int large = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            large = Math.max(large, arr[i]);
//        }
//        int sLarge = Integer.MIN_VALUE;
//        boolean flag = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > sLarge && arr[i] < large) {
//                sLarge = arr[i];
//                flag = true;
//            }
//        }
//        return flag ? sLarge : -1;
    }

    public static int largestElement(int[] arr) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            large = Math.max(large, arr[i]);
        }
        return large;
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
