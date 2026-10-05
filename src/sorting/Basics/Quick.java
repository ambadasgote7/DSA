package sorting.Basics;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low<high) {
            int pIdx = partition(arr,low,high);
            quickSort(arr,low,pIdx-1);
            quickSort(arr,pIdx+1,high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        while (i<j) {
            while (arr[i]<=pivot && i < high) i++;
            while (arr[j]>pivot && j > low) j--;
            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}


