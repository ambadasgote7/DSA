package arrays.OneDArray;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,45,89,6,45,101,8,9,4,60,70};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        System.out.println(min + " is max element in the array");
    }
}
