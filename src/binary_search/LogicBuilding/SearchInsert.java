package binary_search.LogicBuilding;

public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        int ans = searchInsert(arr, target);
        System.out.println(ans);
    }

    public static int searchInsert(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}
