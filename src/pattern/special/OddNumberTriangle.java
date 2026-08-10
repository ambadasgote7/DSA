package pattern.special;

public class OddNumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i*2; j++) {
//                if (j % 2 != 0) {
//                    System.out.print(j + " ");
//                }
//                System.out.print(j + " ");
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
    }
}
