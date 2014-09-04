import static org.junit.Assert.*;

import org.junit.Test;


public class ValidPalindromeTest {

	@Test
	public void test() {
		String s = "A man, a plan, a canal: Panama";
		ValidPalindrome a = new ValidPalindrome();
		assertEquals(true, a.isPalindrome(s));
	}
	
	@Test
	public void test2() {
		String s = "race a car";
		ValidPalindrome a = new ValidPalindrome();
		assertEquals(false, a.isPalindrome(s));
	}
	
	@Test
	public void test3() {
		String s = "";
		ValidPalindrome a = new ValidPalindrome();
		assertEquals(true, a.isPalindrome(s));
	}
	
	@Test
	public void test4() {
		String s = "aa";
		ValidPalindrome a = new ValidPalindrome();
		assertEquals(true, a.isPalindrome(s));
	}
	
	@Test
	public void test5() {
		String s = "bab";
		ValidPalindrome a = new ValidPalindrome();
		assertEquals(true, a.isPalindrome(s));
	}

	@Test
	public void test6() {
		String s = "ba b";
		ValidPalindrome a = new ValidPalindrome();
		assertEquals(true, a.isPalindrome(s));
	}
	
	@Test
	public void test7() {
		String s = "b ab";
		ValidPalindrome a = new ValidPalindrome();
		assertEquals(true, a.isPalindrome(s));
	}
	
	@Test
	public void test8() {
		String s = "1a2";
		ValidPalindrome a = new ValidPalindrome();
		assertEquals(false, a.isPalindrome(s));
	}
}
