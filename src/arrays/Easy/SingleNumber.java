package arrays.Easy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
    static int singleNumber(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
    }
}
