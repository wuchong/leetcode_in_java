import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromePartitioningIITest {

	@Test
	public void test() {
		String s = "aab";
		PalindromePartitioningII a = new PalindromePartitioningII();
		assertEquals(1, a.minCut(s));
	}
	
	@Test
	public void test2() {
		String s = "aa";
		PalindromePartitioningII a = new PalindromePartitioningII();
		assertEquals(0, a.minCut(s));
	}
	
	@Test
	public void test3() {
		String s = "b";
		PalindromePartitioningII a = new PalindromePartitioningII();
		assertEquals(0, a.minCut(s));
	}
	
	@Test
	public void test4() {
		String s = "";
		PalindromePartitioningII a = new PalindromePartitioningII();
		assertEquals(0, a.minCut(s));
	}
	
	@Test
	public void test5() {
		String s = "babab";
		PalindromePartitioningII a = new PalindromePartitioningII();
		assertEquals(0, a.minCut(s));
	}
	
	@Test
	public void test6() {
		String s = "bbbaa";
		PalindromePartitioningII a = new PalindromePartitioningII();
		assertEquals(1, a.minCut(s));
	}
	
	@Test
	public void test7() {
		String s = "bcbcb";
		PalindromePartitioningII a = new PalindromePartitioningII();
		assertEquals(0, a.minCut(s));
	}
	
	

}
