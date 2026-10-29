package binary_search.Basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 12;
        int ans = binarySearch(arr,target);
        if (ans == -1) System.out.println(target + " is not present in the given array.");
        else System.out.println(target + " is present at index " + ans + " in the given array.");
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid-1;
            } else low = mid+1;
        }
        return -1;
    }
}
