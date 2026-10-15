package arrays.Medium;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;
        List<List<Integer>> ans = fourSum(arr, target);
        System.out.println(ans);
    }
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        // Method 3 - Sorting + Two Pointers
        // TC: O(N log N) + O(N^3) = O(N^3)
        // SC: O(m), where m is the number of unique quadruplets
        Arrays.sort(arr);
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i-1]) continue;
            for (int j = i+1; j < n; j++) {
                if (j > i+1 && arr[j] == arr[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while (k < l) {
                    long sum = arr[i] + arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        set.add(temp);
                        k++;l--;
                        while (k < l && arr[k] == arr[k-1]) k++;
                        while (k < l && arr[l] == arr[l+1]) l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(set);

//        // Method 2 - HashSet
//        // TC: O(N^3) average
//       // SC: O(N + m), where m is the number of unique quadruplets
//        int n = arr.length;
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                Set<Integer> s = new HashSet<>();
//                for (int k = j+1; k < n; k++) {
//                    long sum = arr[i]+arr[j];
//                    sum += arr[k];
//                    long val = target - sum;
//                    if (val >= Integer.MIN_VALUE &&
//                            val <= Integer.MAX_VALUE &&
//                            s.contains((int) val)) {
//                        List<Integer> temp = new ArrayList<>();
//                        temp.add(arr[i]);
//                        temp.add(arr[j]);
//                        temp.add(arr[k]);
//                        temp.add((int)val);
//                        temp.sort(java.util.Comparator.naturalOrder());
//                        set.add(temp);
//                    }
//                    s.add(arr[k]);
//                }
//            }
//        }
//        return new ArrayList<>(set);

        // Method 1 - Brute Force
        // TC: O(N^4)
        // SC: O(m), where m is the number of unique quadruplets
//        int n = arr.length;
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                for (int k = j+1; k < n; k++) {
//                    for (int l = k+1; l < n; l++) {
//                        long sum = arr[i] + arr[j];
//                        sum += arr[k];
//                        sum += arr[l];
//                        if (sum == target) {
//                            List<Integer> temp = new ArrayList<>();
//                            temp.add(arr[i]);
//                            temp.add(arr[j]);
//                            temp.add(arr[k]);
//                            temp.add(arr[l]);
//                            temp.sort(java.util.Comparator.naturalOrder());
//                            set.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(set);
    }
}
