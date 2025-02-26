package Arrays;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] a={7,6,4,3,1};
        int[] b={7,1,5,3,6,4};
        System.out.println(maxProfit(a));

    }
    public static int maxProfit(int[] prices) {
        int buy = prices[0], max = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > buy) max = Math.max(max, prices[i] - buy);
            else buy = prices[i];
        }
        return max;
    }
}
