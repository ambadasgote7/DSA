package arrays.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {14,9,15,12,6,8,13};
        int ans = search(arr, 15);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
