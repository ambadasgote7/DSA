package arrays.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,8,4,6,2,0,9,7,5};
        int ans = findMissingNumber(arr);
        System.out.println(ans);
    }

    static int findMissingNumber(int[] arr) {
        // Method 4 - Optimal using XOR
        int xor1 = 0, xor2 = 0 , n = arr.length;
        for (int i = 0; i < n; i++) {
            xor1 ^= arr[i];
            xor2 ^= i;
        }
        xor2 ^= n;
        return xor2 ^ xor1;
//        // Method 3 - Optimal using sum
//        int n = arr.length;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return (n*(n+1)/2) - sum;

//        // Method 2 - Better using O(n) space
//        int[] mark = new int[arr.length+1];
//        for (int i = 0; i < arr.length; i++) {
//            mark[arr[i]] = 1;
//        }
//        for (int i = 0; i < mark.length; i++) {
//            if (mark[i] == 0) return i;
//        }
//        return 545546;


//        // Method 1 - Brute Force
//        for (int i = 0; i < arr.length+1; i++) {
//            boolean flag = false;
//            for (int j = 0; j < arr.length; j++) {
//                if (i == arr[j]) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) {
//                return i;
//            }
//        }
//        return 145556;
    }
}
