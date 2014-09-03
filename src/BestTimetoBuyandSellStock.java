/**
 * Say you have an array for which the ith element is the price
 * of a given stock on day i.
 * 
 * If you were only permitted to complete at most one transaction 
 * (ie, buy one and sell one share of the stock), 
 * design an algorithm to find the maximum profit.
 * 
 * answer: 贪心法，分别找到价格最低的一天，和收益最多的值
 * 
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
    	if(prices.length < 2)	return 0;
        int buy = prices[0];
        int max = 0;
        
        for(int i=1;i<prices.length;i++){
        	max = Math.max(max, prices[i]-buy);
        	buy = Math.min(buy, prices[i]);
        }
        return max;
    }
}
