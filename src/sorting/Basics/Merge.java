package sorting.Basics;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {10,5,23,63,52,4,9,8,37};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        int k = low;
        int[] temp = new int[arr.length];
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }
}
