package arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {0,0,0};
        List<Integer> ans = majorityElement(arr);
        System.out.println(ans);
    }
    public static List<Integer> majorityElement(int[] arr) {
        // Method 3 - Optimal, TC - O(2N) & SC - O(1)
        List<Integer> ans = new ArrayList<>();
        int n = arr.length, min = (n/3)+1;
        int count1 = 0, count2 = 0;
        int ele1 = 0, ele2 = 0;
        for (int i = 0; i < n; i++) {
            if (count1 == 0 && ele2 != arr[i]) {
                count1++;
                ele1 = arr[i];
            } else if (count2 == 0 && ele1 != arr[i]) {
                count2++;
                ele2 = arr[i];
            } else if (ele1 == arr[i]) {
                count1++;
            } else if (ele2 == arr[i]) {
                count2++;
            } else {
                count1--;count2--;
            }
        }
        count1 = 0; count2 = 0;
        for (int i = 0; i < n; i++) {
            if (ele1 == arr[i]) count1++;
            if (ele2 == arr[i]) count2++;
        }
        if (count1 >= min && !ans.contains(ele1)) ans.add(ele1);
        if (count2 >= min && !ans.contains(ele2)) ans.add(ele2);
        return ans;


//        // Method 2 - Better, TC - O(n) & SC - O(n)
//        List<Integer> ans = new ArrayList<>();
//        int n = arr.length, min = (n/3)+1;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() >= min) {
//                ans.add(entry.getKey());
//            }
//            if (ans.size() == 2) break;
//        }
//        return ans;

//        // Method 1 - Brute , TC - O(N^2) & SC - O(1)
//        List<Integer> ans = new ArrayList<>();
//        int n = arr.length, min = (n/3)+1;
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (arr[i] == arr[j]) count++;
//            }
//            if(count >= min && !ans.contains(arr[i])) ans.add(arr[i]);
//            if(ans.size() == 2) break;
//        }
//        return ans;
    }
}
