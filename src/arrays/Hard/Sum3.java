package arrays.Hard;

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int[] arr) {
        // Method 3 - Tc(O(N log N) + O(N^2) & Sc - O(m) where m is unique triplets
        Arrays.sort(arr);
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while (j < k) {
                int sum = arr[i]+arr[j]+arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    set.add(list);
                    j++;k--;
                    while (j < k && arr[j] == arr[j-1]) j++;
                    while (j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return new ArrayList<>(set);

        // Method 2 - Better , TC- O(n^2) & SC - O(n+m) where m is unique triplets
//        int n = arr.length;
//        List<List<Integer>> ans = new ArrayList<>();
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            Set<Integer> s = new HashSet<>();
//            for (int j = i+1; j < n; j++) {
//                int val = -(arr[i] + arr[j]);
//                if (s.contains(val)) {
//                    List<Integer> list = new ArrayList<>();
//                    list.add(arr[i]);
//                    list.add(val);
//                    list.add(arr[j]);
//                    list.sort(java.util.Comparator.naturalOrder());
//                    set.add(list);
//                }
//                s.add(arr[j]);
//            }
//        }
//        ans.addAll(set);
//        return ans;

//        // Method 1 - Brute
//        int n = arr.length;
//        List<List<Integer>> ans = new ArrayList<>();
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                for (int k = j+1; k < n; k++) {
//                    List<Integer> list = new ArrayList<>();
//                    if (arr[i]+arr[j]+arr[k] == 0) {
//                       list.add(arr[i]);
//                        list.add(arr[j]);
//                        list.add(arr[k]);
//                        list.sort(java.util.Comparator.naturalOrder());
//                        set.add(list);
//                    }
//
//                }
//            }
//        }
//        ans.addAll(set);
//        return ans;
    }
}
