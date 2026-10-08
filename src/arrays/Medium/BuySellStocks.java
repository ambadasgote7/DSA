package arrays.Medium;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }

    public static int maxProfit(int[] arr) {
        int buyCost = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - buyCost;
            profit = Math.max(profit, cost);
            buyCost = Math.min(arr[i], buyCost);
        }
        return profit;
    }
}
