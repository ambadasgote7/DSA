package arrays.Medium;

public class MinimumPenaltyForShop {
    public static void main(String[] args) {
        int ans = bestClosingTime("YYNY");
        System.out.println(ans);
    }
    public static int bestClosingTime(String s) {
        int n = s.length();
        int[] pre = new int[n+1];
        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i-1];
            if (s.charAt(i-1) == 'N') pre[i] += 1;
        }
        int[] suf = new int[n+1];
        for (int i = n-1; i >= 0; i--) {
            suf[i] = suf[i+1];
            if (s.charAt(i) == 'Y') suf[i] += 1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < pre.length; i++) {
            pre[i] += suf[i];
            min = Math.min(min, pre[i]);
        }
        for (int i = 0; i < pre.length; i++) {
            if (pre[i] == min) return i;
        }
        return -1;
    }
}
