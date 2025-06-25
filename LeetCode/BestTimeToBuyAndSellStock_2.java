package LeetCode;

public class BestTimeToBuyAndSellStock_2 {
    public static void main(String[] args) {
        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int buyIndex = 0;
        int sellIndex = 1;
        int n = prices.length - 1;
        while (buyIndex < n && sellIndex < n) {
            if (prices[buyIndex] < prices[sellIndex] && prices[sellIndex] > prices[sellIndex + 1]) {
                totalProfit += prices[sellIndex] - prices[buyIndex];
                buyIndex = sellIndex + 1;
                sellIndex += 2;
            } else if (prices[buyIndex] < prices[sellIndex] && prices[sellIndex] <= prices[sellIndex + 1]) {
                sellIndex++;

            } else {
                buyIndex++;
                sellIndex++;
            }
        }

        if (sellIndex == n && prices[buyIndex] < prices[sellIndex]) {
            totalProfit += prices[sellIndex] - prices[buyIndex];
        }

        //Another approach
        /* int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // If today's price is higher than yesterday, take the profit
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        } */

        return totalProfit;
    }
}
