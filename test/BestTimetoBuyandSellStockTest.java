import static org.junit.Assert.*;

import org.junit.Test;


public class BestTimetoBuyandSellStockTest {

	@Test
	public void test() {
		int[] prices = {3,4,5,4,1,3,6,9,8,7};
		BestTimetoBuyandSellStock a = new BestTimetoBuyandSellStock();
		assertEquals(8, a.maxProfit(prices));
	}
	
	@Test
	public void test2() {
		int[] prices = {};
		BestTimetoBuyandSellStock a = new BestTimetoBuyandSellStock();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test3() {
		int[] prices = {3};
		BestTimetoBuyandSellStock a = new BestTimetoBuyandSellStock();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test4() {
		int[] prices = {2,1};
		BestTimetoBuyandSellStock a = new BestTimetoBuyandSellStock();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test5() {
		int[] prices = {1,2};
		BestTimetoBuyandSellStock a = new BestTimetoBuyandSellStock();
		assertEquals(1, a.maxProfit(prices));
	}

	@Test
	public void test6() {
		int[] prices = {1,2,3};
		BestTimetoBuyandSellStock a = new BestTimetoBuyandSellStock();
		assertEquals(2, a.maxProfit(prices));
	}
	
	@Test
	public void test7() {
		int[] prices = {2,1,4};
		BestTimetoBuyandSellStock a = new BestTimetoBuyandSellStock();
		assertEquals(3, a.maxProfit(prices));
	}
	
	@Test
	public void test8() {
		int[] prices = {1,1,4};
		BestTimetoBuyandSellStock a = new BestTimetoBuyandSellStock();
		assertEquals(3, a.maxProfit(prices));
	}
	
	@Test
	public void test9() {
		int[] prices = {2,2,1};
		BestTimetoBuyandSellStock a = new BestTimetoBuyandSellStock();
		assertEquals(0, a.maxProfit(prices));
	}
}
