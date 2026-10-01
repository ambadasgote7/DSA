package recursion.Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    // 0 1 1 2 3 5 8 13 21 34 ...
    static int fibo(int n) {
        if (n <= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
