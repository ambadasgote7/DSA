package arrays.PracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems {
    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    sum += mat[i][j];

                if (i + j == n-1 && i != j)
                    sum += mat[i][j];
            }
        }

        System.out.println(sum);

    }



    public boolean checkIfPangram(String s) {

        if (s.length() < 26) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) ch-97;
            freq[idx]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) return false;
        }
        return true;
    }

    public static int[] createTargetArray(int[] arr, int[] index) {
        List<Integer> list = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            list.add(index[i], arr[i]);
        }
        System.out.println(list);
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
