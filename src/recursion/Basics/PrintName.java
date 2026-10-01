package recursion.Basics;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        print(1,n);
    }
    public static void print(int i, int n) {
        if(i>n) return;
        System.out.println("Ambadas");
        print(i+1,n);
    }
}
