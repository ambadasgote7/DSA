package binary_search.Easy_LogicBuilding;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 6;
        int ans = findFloor(arr, target);
        System.out.println(ans);
    }

    public static int findFloor(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n-1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid+1;
            } else high = mid-1;
        }
        return ans;
    }
}
