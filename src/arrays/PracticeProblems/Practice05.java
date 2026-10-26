package arrays.PracticeProblems;

import java.util.Arrays;

public class Practice05 {
    public static void main(String[] args) {
        int []arr = {7 ,4 ,1 ,5 ,3};
        System.out.println(Arrays.toString(arr));
        System.out.println("==================");
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr) {
        int n = arr.length;
        quick(arr, 0, n-1);
    }
    
    static void quick(int[] arr, int low, int high) {
        if (low <= high) {
            int pivot = partition(arr, low, high);
            quick(arr, low, pivot-1);
            quick(arr, pivot+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        while (i < j) {
            while (arr[i] <= pivot && i < high) i++;
            while (arr[j] >= pivot && j > low) j--;
            if (i < j) {
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


    public static void mergerSort(int[] arr) {
        int n = arr.length;
        divide(arr, 0, n-1);
    }

    public static void divide(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = low + (high-low) / 2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid+1;
        int k = 0;
        int[] temp = new int[high - low + 1];
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
            arr[i] = temp[i-low];
        }
    }

    public static void insertionSort(int[] arr) {
        // Method 2 - Using for-for loop
        int n= arr.length;
        for (int i = 1; i < n; i++) {
           for (int j = i; j > 0; j--) {
               if (arr[j] < arr[j-1]) {
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               } else break;
           }
        }
        // Method 1 - Using for-while loop
//        int n= arr.length;
//        for (int i = 1; i < n; i++) {
//            while (i > 0 && arr[i] < arr[i-1]) {
//                int temp = arr[i];
//                arr[i] = arr[i-1];
//                arr[i-1] = temp;
//                i--;
//            }
//        }
    }

    public static void selectionSort(int[] arr) {
        // Method 2 - Using max index
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minI = n-i-1;
            for (int j = 0; j < n-i; j++) {
                if (arr[j] > arr[minI]) minI = j;
            }
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[minI];
            arr[minI] = temp;
        }
        // Method 1 - Using min index
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int minI = i;
//            for (int j = i; j < n; j++) {
//                if (arr[j] < arr[minI]) minI = j;
//            }
//            int temp = arr[i];
//            arr[i] = arr[minI];
//            arr[minI] = temp;
//        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int pass = 1; pass < n; pass++) {
            boolean flag = false;
            for (int i = 0; i < n-pass; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        // Method 1 -
//        int n = arr.length;
//        for (int pass = 1; pass < n; pass++) {
//            for (int i = 0; i < n-pass; i++) {
//                if (arr[i] > arr[i+1]) {
//                   int temp = arr[i];
//                   arr[i] = arr[i+1];
//                   arr[i+1] = temp;
//                }
//            }
//        }
    }
}
