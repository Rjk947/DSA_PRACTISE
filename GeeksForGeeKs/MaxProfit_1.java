package GeeksForGeeKs;

public class MaxProfit_1 {
    public static void main(String[] args) {
        System.out.println(maximumProfit(new int[]{1, 3, 6, 9, 11}));
    }

    public static int maximumProfit(int prices[]) {
        // Code here
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            }else {
                profit = Math.max(profit, price - minPrice);
            }
        }

        return profit;
    }
}
