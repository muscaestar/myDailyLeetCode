package _121_Best_Time_to_Buy_and_Sell_Stock;

/**
 * Created by muscaestar on 3/9/20
 *
 * @author muscaestar
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int i = 0;
        int low = prices[i];
        int profit = 0;
        while (i < prices.length) {
            int curr = prices[i];
            low = Math.min(curr, low);
            profit = Math.max(profit, curr - low);
            i++;
        }
        return profit;
    }
}
