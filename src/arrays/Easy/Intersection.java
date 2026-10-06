package arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,6};
        int[] brr = {2,3,3,5,6,7,8};
        List<Integer> ans = intersectionOfSortedArrays(arr, brr);
        System.out.println(ans);
    }
    public static List<Integer> intersectionOfSortedArrays(int[] arr, int[] brr) {
        List<Integer> ans = new ArrayList<>();
//        int[] visited = new int[brr.length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < brr.length; j++) {
//                if (arr[i] == brr[j] && visited[j] == 0) {
//                    ans.add(arr[i]);
//                    visited[j] = 1;
//                }
//            }
//        }
        int m = arr.length, n = brr.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr[i] == brr[j]) {
                ans.add(arr[i]);
                j++;
            }
            i++;
        }
        return ans;
    }
}
