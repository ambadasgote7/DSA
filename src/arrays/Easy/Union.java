package arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void main(String[] args) {
       int[] arr = {1,1,2,3,4,5,7,7,8,8,8,9,10};
       int[] brr = {2,3,4,4,5,6};
       List<Integer> ans = unionOfSortedArrays(arr,brr);
        System.out.println(ans);
    }
    static List<Integer> unionOfSortedArrays(int[] arr, int[] brr) {
        int m = arr.length;
        int n = brr.length;
        int i = 0, j = 0;
        List<Integer> union = new ArrayList<>();
        while (i < m && j < n) {
            if (arr[i] <= brr[j]) {
                if (union.isEmpty() || union.getLast() != arr[i]) {
                    union.add(arr[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.getLast() != brr[j]) {
                    union.add(brr[j]);
                }
                j++;
            }
        }
        while (i<m) {
            if (union.isEmpty() || union.getLast() != arr[i]) {
                union.add(arr[i]);
            }
            i++;
        }
        while (j<n) {
            if (union.isEmpty() || union.getLast() != brr[j]) {
                union.add(brr[j]);
            }
            j++;
        }
        return union;
    }
}
