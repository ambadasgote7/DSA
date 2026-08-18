package arrays.OneDArray;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,45,89,6,45,101,8,9,4,60,70};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println(max + " is max element in the array");
    }
}
