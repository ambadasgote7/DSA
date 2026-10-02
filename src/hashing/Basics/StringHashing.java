package hashing.Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringHashing {
    public static void main(String[] args) {

//        String s = "abcdabefc";
//        int[] hash = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            hash[s.charAt(i)-'a']++;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n : ");
//        int n = sc.nextInt();
//        while(n-- > 0) {
//            char ch = sc.next().charAt(0);
//            System.out.println(hash[ch-'a']);
//        }
        String s = "abcdabefc";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
    }
}
