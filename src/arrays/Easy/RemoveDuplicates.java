package arrays.Easy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] arr) {
       // Method 1 - Using Set
//        Set<Integer> set = new LinkedHashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        int i = 0;
//        for (int ele : set) {
//            arr[i++] = ele;
//        }
//        return i;

        // Method 2 - Optimized with o(1) space
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
