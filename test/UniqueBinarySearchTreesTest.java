import static org.junit.Assert.*;

import org.junit.Test;


public class UniqueBinarySearchTreesTest {

	@Test
	public void test3() {
		int n = 3;
		UniqueBinarySearchTrees a = new UniqueBinarySearchTrees();
		assertEquals(5, a.numTrees(n));
	}
	
	@Test
	public void test1() {
		int n = 1;
		UniqueBinarySearchTrees a = new UniqueBinarySearchTrees();
		assertEquals(1, a.numTrees(n));
	}
	
	@Test
	public void test2() {
		int n = 2;
		UniqueBinarySearchTrees a = new UniqueBinarySearchTrees();
		assertEquals(2, a.numTrees(n));
	}
	


}
