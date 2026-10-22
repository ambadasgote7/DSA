package arrays.PracticeProblems;

import java.util.*;

public class Practice02 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int r = 4, c = 2;
        System.out.println(pascalTriangleI(r,c));
    }
    public static int pascalTriangleI(int r, int c) {
        int n = r;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    l.add(1);
                } else {
                    l.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(l);
        }
        return list.get(r-1).get(c-1);
    }

    public static int majorityElement(int[] arr) {
        int count = 0, n = arr.length;
        int ele = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count++;
                ele = arr[i];
            } else if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) max++;
        }
        return max > n/2 ? ele : -1;
    }

    public static List<Integer> leaders(int[] arr) {
        int n = arr.length;
        int max = arr[n-1];
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[n-1]);
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                ans.add(max);
            }
        }
        n = ans.size();
        for (int i = 0; i < n/2; i++) {
            int temp = ans.get(i);
            int temp2 = ans.get(n-i-1);
            ans.set(i,temp2);
            ans.set(n-i-1,temp);
        }
        return ans;
    }
}
