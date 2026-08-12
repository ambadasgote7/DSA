package pattern.composite;

import java.util.Map;

public class NumberSpiral {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                int a = i, b = j;
                if (i > n) a = 2*n-i;
                if (j > n) b = 2*n-j;
                int k = n+1-Math.min(a,b);
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
