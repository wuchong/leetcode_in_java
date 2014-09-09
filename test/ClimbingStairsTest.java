import static org.junit.Assert.*;

import org.junit.Test;


public class ClimbingStairsTest {

	@Test
	public void test() {
		int n = 1;
		ClimbingStairs a = new ClimbingStairs();
		assertEquals(1, a.climbStairs(n));
	}

	@Test
	public void test2() {
		int n = 0;
		ClimbingStairs a = new ClimbingStairs();
		assertEquals(1, a.climbStairs(n));
	}
	
	@Test
	public void test3() {
		int n = 2;
		ClimbingStairs a = new ClimbingStairs();
		assertEquals(2, a.climbStairs(n));
	}
	
	@Test
	public void test4() {
		int n = 5;
		ClimbingStairs a = new ClimbingStairs();
		assertEquals(8, a.climbStairs(n));
	}
	
}
