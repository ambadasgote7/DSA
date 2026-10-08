package arrays.Medium;

import java.util.Arrays;

public class SortZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0,2,1,1,1,0,2,2,1,0,2,1,0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while (mid < high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;mid++;
            }
            if (arr[mid] == 1) {
                mid++;
            }
            if(arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
