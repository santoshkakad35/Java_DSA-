package Arrays;
// 121 Buy and Sell the stock
public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int max = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++) {
            if(buy > prices[i]) {
                buy = prices[i];
            }

            int profit = prices[i] - buy;
            max = Math.max(max,profit);
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
