package hashing.Basics;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        int n = arr.length;
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        System.out.println(Arrays.toString(hash));
    }
}
