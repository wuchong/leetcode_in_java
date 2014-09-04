import static org.junit.Assert.*;

import org.junit.Test;


public class BestTimetoBuyandSellStockIIITest {

	@Test
	public void test() {
		int[] prices = {3,4,5,4,1,3,6,9,7,8};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(10, a.maxProfit(prices));
	}
	
	@Test
	public void test2() {
		int[] prices = {};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test3() {
		int[] prices = {3};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test4() {
		int[] prices = {2,1};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test5() {
		int[] prices = {1,2};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(1, a.maxProfit(prices));
	}

	@Test
	public void test6() {
		int[] prices = {1,2,3};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(2, a.maxProfit(prices));
	}
	
	@Test
	public void test7() {
		int[] prices = {2,1,4};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(3, a.maxProfit(prices));
	}
	
	@Test
	public void test8() {
		int[] prices = {1,1,4};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(3, a.maxProfit(prices));
	}
	
	@Test
	public void test9() {
		int[] prices = {2,2,1};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(0, a.maxProfit(prices));
	}
	
	@Test
	public void test10() {
		int[] prices = {2,2,1,3};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(2, a.maxProfit(prices));
	}
	
	@Test
	public void test11() {
		int[] prices = {2,1,3,2,4,3,6,6,5,9};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(9, a.maxProfit(prices));
	}

	@Test
	public void test12() {
		int[] prices = {1,2,4,2,5,7,2,4,9,0};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(13, a.maxProfit(prices));
	}
	
	@Test
	public void test13() {
		int[] prices = {1,4,3,9,1,3};
		BestTimetoBuyandSellStockIII a = new BestTimetoBuyandSellStockIII();
		assertEquals(10, a.maxProfit(prices));
	}
	
}
