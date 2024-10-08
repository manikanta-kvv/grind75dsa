package arrays;

public class BestTimeToBuyAndSellStocks {

    public static  int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minStockPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minStockPrice) {
                minStockPrice = prices[i];
            }
            int currentProfit = prices[i] - minStockPrice;
            if(currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }


        return  maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}