import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeNumberTest {

	@Test
	public void test() {
		int n = 3223;
		PalindromeNumber a = new PalindromeNumber();
		assertEquals(true, a.isPalindrome(n));
	}

	@Test
	public void test2() {
		int n = 32123;
		PalindromeNumber a = new PalindromeNumber();
		assertEquals(true, a.isPalindrome(n));
	}
	
	@Test
	public void test3() {
		int n = -3223;
		PalindromeNumber a = new PalindromeNumber();
		assertEquals(false, a.isPalindrome(n));
	}
	
	@Test
	public void test4() {
		int n = Integer.MAX_VALUE;
		PalindromeNumber a = new PalindromeNumber();
		assertEquals(false, a.isPalindrome(n));
	}
	
	@Test
	public void test5() {
		int n = 1;
		PalindromeNumber a = new PalindromeNumber();
		assertEquals(true, a.isPalindrome(n));
	}
	
}
