public class BestTimetoBuyAndSell {

      public int maxProfit(int[] prices) {
        int profit=0, minPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            minPrice = Math.min(prices[i], minPrice);
            profit = Math.max(prices[i]-minPrice,profit);
        }
        return profit;   
    }
    public static void main(String[] args) {
        // take inputs accordingly
    }
}
