package arrays.Easy;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {10,8,9,37,65,4};
        int smallest = arr[0];
        int sSmallest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < smallest) {
                sSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest Element : " + sSmallest);
    }
}
