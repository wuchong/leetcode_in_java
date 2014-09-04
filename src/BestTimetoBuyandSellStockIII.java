/**
 * Say you have an array for which the ith element 
 * is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. 
 * You may complete at most two transactions.
 *
 * Note:
 * You may not engage in multiple transactions at the same time 
 * (ie, you must sell the stock before you buy again).
 * 
 * answer: 动态规划，before[i] 代表前i个数的最大收益，after[i] 代表后i个数的最大收益
 * profit = max {before[i] + after[len-i]}
 */
public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
    	int len = prices.length;
		if(len == 0)	return 0;
		int[] before = new int[len+1];	//before[i] 代表前i个数的最大收益
		int[] after = new int[len+1];	//after[i] 代表后i个数的最大收益
		before[0] = before[1] = 0; 
		after[0] = after[1] = 0;	//初始化边界
		
		int buy = prices[0];
		int max = 0;
        for(int i=1;i<len;i++){
        	max = Math.max(max, prices[i]-buy);
        	buy = Math.min(buy, prices[i]);
        	before[i+1] = max;
        }
        
        int sell = prices[len-1];
        max = 0;
        for(int j=len-2;j>=0;j--){
        	max = Math.max(max, sell-prices[j]);
        	sell = Math.max(sell, prices[j]);
        	after[len-j] = max;
        }
        
        int profit = 0;
        for(int i=0;i<len;i++){
        	profit = Math.max(profit, before[i] + after[len-i]);
        }
        return profit;
    }
}
