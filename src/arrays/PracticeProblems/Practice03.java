package arrays.PracticeProblems;

public class Practice03 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 1, 3, 5};
        long ans = inversionCount(arr);
        System.out.println(ans);
    }
    public static long inversionCount(int[] arr) {
        int n = arr.length;
        return divide(arr, 0, n-1);
    }

    static int divide(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = low + (high - low) / 2;
        count += divide(arr, low, mid);
        count += divide(arr, mid+1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    static int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
        int left = low, right = mid+1;
        int k = low;
        int[] temp = new int[arr.length];
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
}
