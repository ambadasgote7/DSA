package recursion.Basics;

import java.util.Scanner;

public class PrintNtoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
//        print(n);
        print(1,n);
    }
    public static void print(int n) {
        if(n<1) return;
        System.out.println(n);
        print(n-1);
    }
    public static void print(int i, int n) {
        if(i>n) return;
        print(i+1,n);
        System.out.println(i);
    }

}
