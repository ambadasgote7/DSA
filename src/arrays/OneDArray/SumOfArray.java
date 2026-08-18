package arrays.OneDArray;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,3,17,10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array is " + sum);
    }
}
