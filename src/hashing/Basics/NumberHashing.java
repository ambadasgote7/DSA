package hashing.Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberHashing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
//        int n = arr.length;
//        int[] hash = new int[13];
//        for (int i = 0; i < n; i++) {
//            hash[arr[i]]++;
//        }
//        System.out.println(Arrays.toString(hash));
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
}
