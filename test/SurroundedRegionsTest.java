import static org.junit.Assert.*;

import org.junit.Test;


public class SurroundedRegionsTest {

	@Test
	public void test() {
		char[][] board = {"XXXX".toCharArray(),"XOOX".toCharArray(),
						"XXOX".toCharArray(),"XOXX".toCharArray()};
		char[][] expecteds = {"XXXX".toCharArray(),"XXXX".toCharArray(),
				"XXXX".toCharArray(),"XOXX".toCharArray()};
		SurroundedRegions a = new SurroundedRegions();
		a.solve(board);
		AssertUtil.assert2DArrayEquals(expecteds, board);
	}

	@Test
	public void test2() {
		char[][] board = {"XXXX".toCharArray(),"XXOX".toCharArray(),
						"XOOX".toCharArray(),"XOOX".toCharArray(),
						"XOXO".toCharArray()};
		char[][] expecteds = {"XXXX".toCharArray(),"XXOX".toCharArray(),
				"XOOX".toCharArray(),"XOOX".toCharArray(),
				"XOXO".toCharArray()};
		SurroundedRegions a = new SurroundedRegions();
		a.solve(board);
		AssertUtil.assert2DArrayEquals(expecteds, board);
	}
	
	@Test
	public void test3() {
		char[][] board = {"XXXX".toCharArray(),"XXOX".toCharArray(),
						"XOOX".toCharArray(),"XOOX".toCharArray(),
						"XXXO".toCharArray()};
		char[][] expecteds = {"XXXX".toCharArray(),"XXXX".toCharArray(),
				"XXXX".toCharArray(),"XXXX".toCharArray(),
				"XXXO".toCharArray()};
		SurroundedRegions a = new SurroundedRegions();
		a.solve(board);
		AssertUtil.assert2DArrayEquals(expecteds, board);
	}
	
	@Test
	public void test4() {
		char[][] board = {};
		char[][] expecteds = {};
		SurroundedRegions a = new SurroundedRegions();
		a.solve(board);
		AssertUtil.assert2DArrayEquals(expecteds, board);
	}
	
	@Test
	public void test5() {
		char[][] board = {
				"OOOOOOOOOOO".toCharArray(),
				"OXXXXXXXXXO".toCharArray(),
				"OXOOOOOOOXO".toCharArray(),
				"OXOOOOOOOXO".toCharArray(),
				"OXOOOOOOOXO".toCharArray(),
				"OXOOOOOOOXO".toCharArray(),
				"OXXXXXXXXXO".toCharArray(),
				"OOOOOOOOOOO".toCharArray()};
		char[][] expecteds = {
				"OOOOOOOOOOO".toCharArray(),
				"OXXXXXXXXXO".toCharArray(),
				"OXXXXXXXXXO".toCharArray(),
				"OXXXXXXXXXO".toCharArray(),
				"OXXXXXXXXXO".toCharArray(),
				"OXXXXXXXXXO".toCharArray(),
				"OXXXXXXXXXO".toCharArray(),
				"OOOOOOOOOOO".toCharArray()};
		SurroundedRegions a = new SurroundedRegions();
		a.solve(board);
		AssertUtil.assert2DArrayEquals(expecteds, board);
	}
	

}
