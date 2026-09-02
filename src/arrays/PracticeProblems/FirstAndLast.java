package arrays.PracticeProblems;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[0] = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target && arr[i+1] > target) {
                ans[1] = i;
                break;
            }
        }


        System.out.println(Arrays.toString(ans));
    }
}
