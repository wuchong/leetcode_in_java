import static org.junit.Assert.*;

import org.junit.Test;


public class MinimumPathSumTest {

	@Test
	public void test() {
		int[][] grid = {{1}};
		MinimumPathSum a = new MinimumPathSum();
		assertEquals(1, a.minPathSum(grid));
	}

	@Test
	public void test2() {
		int[][] grid = {{1,11,2,3},{2,7,3,4},{8,6,1,9}};
		MinimumPathSum a = new MinimumPathSum();
		assertEquals(23, a.minPathSum(grid));
	}
	
}
