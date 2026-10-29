package binary_search.Basic;

// Smallest index just greater than equal to the target arr[mid] >= target
// There is no such index then array length (n) will be ans
public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 3;
        int ans = lowerBound(arr,target);
        System.out.println(target + "'s lower bound index is " + ans + " which is element " + arr[ans]);
    }

    public static int lowerBound(int[] arr, int target) {
        int n =  arr.length;
        int low = 0, high = n-1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return ans;
    }
}
