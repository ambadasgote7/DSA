package arrays.PracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problems {
    static void printArr(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

//        int[][] mat = {
//                {0, 0, 0},
//                {0, 1, 0},
//                {1, 1, 1}
//        };
//
//        int[][] target = {
//                {1, 1, 1},
//                {0, 1, 0},
//                {0, 0, 0}
//        };
        int[] arr = {9};

        arr = new int[3];


            int num = arr[0];
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < arr.length; i++) {
                num = num * 10 + arr[i];
            }
            num =+ 1;
            while (num > 0) {
                list.add(num%10);
                num /= 10;
            }
            Collections.reverse(list);
            int[] array = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }


//
//        int n = mat.length;
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j)
//                    sum += mat[i][j];
//
//                if (i + j == n-1 && i != j)
//                    sum += mat[i][j];
//            }
//        }
//
//        System.out.println(sum);

    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }
        printArr(mat);
        System.out.println("---------===========------------");
        printArr(target);
        return Arrays.deepEquals(mat,target);
    }


    public static boolean checkIfPangram(String s) {

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
