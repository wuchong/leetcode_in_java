import static org.junit.Assert.*;

import org.junit.Test;


public class NQueensIITest {

	@Test
	public void test0() {
		int n = 0;
		NQueensII a = new NQueensII();
		assertEquals(0, a.totalNQueens(n));
	}

	@Test
	public void test1() {
		int n = 1;
		NQueensII a = new NQueensII();
		assertEquals(1, a.totalNQueens(n));
	}
	
	@Test
	public void test2() {
		int n = 2;
		NQueensII a = new NQueensII();
		assertEquals(0, a.totalNQueens(n));
	}
	
	@Test
	public void test3() {
		int n = 3;
		NQueensII a = new NQueensII();
		assertEquals(0, a.totalNQueens(n));
	}
	
	@Test
	public void test4() {
		int n = 4;
		NQueensII a = new NQueensII();
		assertEquals(2, a.totalNQueens(n));
	}
	
}
