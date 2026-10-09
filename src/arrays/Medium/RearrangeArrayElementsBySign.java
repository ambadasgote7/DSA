package arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
//        int[] arr = {3,1,-2,-5,2,-4};
//        int[] ans = rearrangeArray(arr);
//        System.out.println(Arrays.toString(ans));
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8));
        rearrange(list);
    }

    static void rearrange(ArrayList<Integer> list) {
        int n = list.size();
        List<Integer> pos = new LinkedList<>();
        List<Integer> neg = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (list.get(i) < 0) {
                neg.add(list.get(i));
            } else {
                pos.add(list.get(i));
            }
        }
        int i = 0, j = 0, k = 0;
        while (i < pos.size() && j < neg.size()) {
            list.set(2*k, pos.get(i++));
            list.set(2*k+1, neg.get(j++));
            k++;
        }
        k = 2 * k;
        while (i < pos.size()) {
            list.set(k++, pos.get(i++));
        }
        while (j < neg.size()) {
            list.set(k++, neg.get(j++));
        }
        System.out.println(list);
    }

    public static int[] rearrangeArray(int[] arr) {
        // Method 2 - Optimal TC - O(n) & SC - O(n)
        int n = arr.length;
        int[] ans = new int[n];
        int pIdx = 0, nIdx = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[pIdx] = arr[i];
                pIdx += 2;
            } else {
                ans[nIdx] = arr[i];
                nIdx += 2;
            }
        }
        return ans;
//        // Method 1 - Brute Force TC O(n)+O(n/2) & SC O(N);
//        int n = arr.length;
//        List<Integer> pos = new LinkedList<>();
//        List<Integer> neg = new LinkedList<>();
//        for(int i = 0; i < n; i++) {
//            if (arr[i] > 0) {
//                pos.add(arr[i]);
//            } else {
//                neg.add(arr[i]);
//            }
//        }
//        for (int i = 0; i < n/2; i++) {
//            arr[2*i] = pos.get(i);
//            arr[2*i+1] = neg.get(i);
//        }
//        return arr;
    }
}
