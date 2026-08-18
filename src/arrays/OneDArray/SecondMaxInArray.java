package arrays.OneDArray;

public class SecondMaxInArray {
    public static void main(String[] args) {
        int[] arr = {10,45,89,6,45,101,8,9,4,60,70};
//        int[] arr = {1,1,1,1,1};
        int mx = Integer.MIN_VALUE;
        int mxIdx = 0;
        int sMx = Integer.MIN_VALUE;
        int sMxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                sMx = mx;
                mx = arr[i];
                mxIdx = i;
            } else if (sMx < arr[i] && arr[i] < mx) {
                sMx = arr[i];
                sMxIdx = i;
            }
        }

        if (mxIdx != sMxIdx) {
            System.out.println("Max is " + mx);
            System.out.println("Second max is " + sMx);
        } else {
            System.out.println("Max is " + mx);
            System.out.println("Second max is " + mx);
        }


    }
}
