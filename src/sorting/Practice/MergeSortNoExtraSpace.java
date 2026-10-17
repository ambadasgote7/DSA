package sorting.Practice;

import java.util.Arrays;

public class MergeSortNoExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7}; int[] arr2 = {0,2,6,8,9};
        int m = arr1.length, n = arr2.length;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    static void swap(int[] arr1, int[] arr2, int i, int j) {
        if (arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        // Method 3 -
        int len = m+n;
        int gap = (len/2) + (len%2);
        while (gap > 0) {
            int left = 0;
            int right = gap;
            while (right < len) {
                if (left < m && right >= m) {
                    swap(arr1, arr2, left, right - m);
                } else if (left >= m) {
                    swap(arr2, arr2, left - m, right - m);
                } else {
                    swap(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if (gap == 1) break;
            gap = (gap/2) + (gap%2);
        }

//        // Method 2 -
//        int left = m-1;
//        int right = 0;
//        while (left >= 0 && right < n) {
//            if (arr1[left] > arr2[right]) {
//                int temp = arr1[left];
//                arr1[left] = arr2[right];
//                arr2[right] = temp;
//                left--;right++;
//            } else {
//                break;
//            }
//        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
            // Method 1 - Brute Force
//        int left = 0;
//        int right = 0;
//        int k = 0;
//        int[] temp = new int[m+n];
//        while (left < m && right < n) {
//            if (arr1[left] <= arr2[right]) {
//                temp[k++] = arr1[left++];
//            } else {
//                temp[k++] = arr2[right++];
//            }
//        }
//        while (left < m) {
//            temp[k++] = arr1[left++];
//        }
//        while (right < n) {
//            temp[k++] = arr2[right++];
//        }
//        for (int i = 0; i < m+n; i++) {
//            if(i < m) arr1[i] = temp[i];
//            else arr2[i-m] = temp[i];
//        }
    }
}
