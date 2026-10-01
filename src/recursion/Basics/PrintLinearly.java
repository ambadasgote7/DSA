package recursion.Basics;

import java.util.Scanner;

public class PrintLinearly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
//        print(1,n);
        print(n);
    }
    public static void print(int i, int n) {
        if(i>n) return;
        System.out.println(i);
        print(i+1,n);
    }
    public static void print(int n) {
        if (n<1) return;
        print(n-1);
        System.out.println(n);
    }
}
