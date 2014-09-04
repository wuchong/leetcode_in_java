/**
 * Say you have an array for which the ith element 
 * is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. 
 * You may complete as many transactions as you like 
 * (ie, buy one and sell one share of the stock multiple times).
 * 
 * However, you may not engage in multiple transactions at the same time 
 * (ie, you must sell the stock before you buy again).
 * 
 * answer: 贪心法，跟上题相似
 */
public class BestTimetoBuyandSellStockII {
	public int maxProfit(int[] prices) {
		if(prices.length == 0)	return 0;
		int buy = prices[0];
		int sell = prices[0];
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] >= sell) {
				sell = prices[i];
			} else {
				profit += (sell - buy);
				buy = sell = prices[i];
			}
		}
		profit += (sell - buy);
		return profit;
	}
}
