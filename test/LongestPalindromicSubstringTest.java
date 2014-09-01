import static org.junit.Assert.*;

import org.junit.Test;


public class LongestPalindromicSubstringTest {

	@Test
	public void test() {
		String s = "ac1213121ef";
		LongestPalindromicSubstring o = new LongestPalindromicSubstring();
		
		assertEquals("1213121", o.longestPalindrome(s));
	}
	
	@Test
	public void test2() {
		String s = "aaaa";
		LongestPalindromicSubstring o = new LongestPalindromicSubstring();
		
		assertEquals("aaaa", o.longestPalindrome(s));
	}
	
	@Test
	public void test3() {
		String s = "a";
		LongestPalindromicSubstring o = new LongestPalindromicSubstring();
		
		assertEquals("a", o.longestPalindrome(s));
	}

	@Test
	public void test4() {
		String s = "bb";
		LongestPalindromicSubstring o = new LongestPalindromicSubstring();
		
		assertEquals("bb", o.longestPalindrome(s));
	}
	
	@Test
	public void test5() {
		String s = "bbb";
		LongestPalindromicSubstring o = new LongestPalindromicSubstring();
		
		assertEquals("bbb", o.longestPalindrome(s));
	}
	
}
