package arrays.Easy;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,8,9,37,65,4};

        int sLargest = Integer.MIN_VALUE;

//        // Method 1 - Sort and Reverse traverse
//        Arrays.sort(arr);
//        int largest = arr[arr.length-1];
//        for (int i = arr.length-2; i >= 0; i--) {
//            if (arr[i] != largest) {
//                sLargest = arr[i];
//
//                break;
//            }
//        }

//        // Method 2 - Two pass
//        int largest = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            largest = Math.max(arr[i],largest);
//        }
//        for (int i = 1; i < arr.length; i++) {
//           if (arr[i] != largest && arr[i] > sLargest) {
//               sLargest = arr[i];
//           }
//        }

        // Method 3 - Optimal using single pass
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        System.out.println("Second largest Element : " + sLargest);
    }
}
