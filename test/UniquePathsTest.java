import static org.junit.Assert.*;

import org.junit.Test;


public class UniquePathsTest {

	@Test
	public void test() {
		int m = 3;
		int n = 2;
		UniquePaths a = new UniquePaths();
		assertEquals(3, a.uniquePaths(m, n));
	}

	@Test
	public void test2() {
		int m = 4;
		int n = 4;
		UniquePaths a = new UniquePaths();
		assertEquals(20, a.uniquePaths(m, n));
	}
	
	@Test
	public void test3() {
		int m = 1;
		int n = 1;
		UniquePaths a = new UniquePaths();
		assertEquals(1, a.uniquePaths(m, n));
	}
	
//	@Test
//	public void test4() {
//		int m = 0;
//		int n = 1;
//		UniquePaths a = new UniquePaths();
//		assertEquals(0, a.uniquePaths(m, n));
//	}
	
}
