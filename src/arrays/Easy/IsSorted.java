package arrays.Easy;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {10,11,9,13,15};
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] >= arr[i]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
