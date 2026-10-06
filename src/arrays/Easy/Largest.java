package arrays.Easy;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {10,8,9,37,65,4};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            largest = Math.max(arr[i],largest);
        }
        System.out.println("Largest Element : " + largest);
    }
}
