package recursion.Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        fact(n,1);
//        System.out.println(fact(n));
    }
    public static int fact(int n) {
        if (n==0) return 1;
        return  n * fact(n-1);
    }
    public static void fact(int n, int fact) {
        if (n < 1) {
            System.out.println(fact);
            return;
        }
        fact(n-1,fact*n);
    }
}
