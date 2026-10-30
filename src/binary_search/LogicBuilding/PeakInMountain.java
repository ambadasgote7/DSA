package binary_search.LogicBuilding;

public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,6,4,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0, high = n-1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid+1]) high = mid;
            else low = mid+1;
        }
        return low;
    }
}
