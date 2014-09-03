import static org.junit.Assert.*;

import org.junit.Test;


public class InterleavingStringTest {

	@Test
	public void test() {
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbcbcac";
		InterleavingString a = new InterleavingString();
		assertEquals(true, a.isInterleave(s1, s2, s3));
	}

	@Test
	public void test2() {
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbbaccc";
		InterleavingString a = new InterleavingString();
		assertEquals(false, a.isInterleave(s1, s2, s3));
	}
	
	@Test
	public void test3() {
		String s1 = "aab";
		String s2 = "abc";
		String s3 = "aabcab";
		InterleavingString a = new InterleavingString();
		assertEquals(true, a.isInterleave(s1, s2, s3));
	}
	
	@Test
	public void test4() {
		String s1 = "aab";
		String s2 = "abc";
		String s3 = "aaabbc";
		InterleavingString a = new InterleavingString();
		assertEquals(true, a.isInterleave(s1, s2, s3));
	}
	
	@Test
	public void test5() {
		String s1 = "aab";
		String s2 = "abc";
		String s3 = "aaacbb";
		InterleavingString a = new InterleavingString();
		assertEquals(false, a.isInterleave(s1, s2, s3));
	}
	
}
