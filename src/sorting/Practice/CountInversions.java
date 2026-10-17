package sorting.Practice;

public class CountInversions {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 1, 3, 5};
        int ans = numberOfInversions(arr);
        System.out.println(ans);
    }

    static int mergeSort(int[] arr, int[] temp, int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, temp, low, mid);
        count += mergeSort(arr, temp,mid+1, high);
        count += merge(arr, temp, low, mid, high);
        return count;
    }

    static int merge(int[] arr, int[] temp, int low, int mid, int high) {
        int count = 0;
        int left = low, right = mid+1, k = low;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
                count += (mid - left + 1);
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
        return count;
    }

    public static int numberOfInversions(int[] arr) {
        // Method 2 -
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);

//        // Method 1 -
//        int count = 0, n = arr.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (arr[i] > arr[j]) count++;
//            }
//        }
//        return count;
    }
}
