import static org.junit.Assert.*;

import org.junit.Test;


public class BestTimetoBuyandSellStockIITest {

	@Test
	public void test() {
		int[] prices = {3,4,5,4,1,3,6,9,8,7};
		BestTimetoBuyandSellStockII a = new BestTimetoBuyandSellStockII();
		assertEquals(10, a.maxProfit(prices));
	}
	
	@Test
	public void test2() {
		int[] prices = {};
		BestTimetoBuyandSellStockII a = new BestTimetoBuyandSellStockII();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test3() {
		int[] prices = {3};
		BestTimetoBuyandSellStockII a = new BestTimetoBuyandSellStockII();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test4() {
		int[] prices = {2,1};
		BestTimetoBuyandSellStockII a = new BestTimetoBuyandSellStockII();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test5() {
		int[] prices = {1,2};
		BestTimetoBuyandSellStockII a = new BestTimetoBuyandSellStockII();
		assertEquals(1, a.maxProfit(prices));
	}

	@Test
	public void test6() {
		int[] prices = {1,2,3};
		BestTimetoBuyandSellStockII a = new BestTimetoBuyandSellStockII();
		assertEquals(2, a.maxProfit(prices));
	}
	
	@Test
	public void test7() {
		int[] prices = {2,1,4};
		BestTimetoBuyandSellStockII a = new BestTimetoBuyandSellStockII();
		assertEquals(3, a.maxProfit(prices));
	}
	
	@Test
	public void test8() {
		int[] prices = {1,1,4};
		BestTimetoBuyandSellStockII a = new BestTimetoBuyandSellStockII();
		assertEquals(3, a.maxProfit(prices));
	}
	
	@Test
	public void test9() {
		int[] prices = {2,2,1};
		BestTimetoBuyandSellStockII a = new BestTimetoBuyandSellStockII();
		assertEquals(0, a.maxProfit(prices));
	}

}
