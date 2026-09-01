package arrays.PracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4}; int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr,index)));
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
