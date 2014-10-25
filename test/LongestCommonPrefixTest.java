import static org.junit.Assert.*;

import org.junit.Test;


public class LongestCommonPrefixTest {

	@Test
	public void test() {
		String[] strs = {"abc123","abc678","abc444"};
		String expected = "abc";
		LongestCommonPrefix a = new  LongestCommonPrefix();
		assertEquals(expected, a.longestCommonPrefix(strs));
	}
	
	@Test
	public void test2() {
		String[] strs = {"1abc123","2abc678","3abc444"};
		String expected = "";
		LongestCommonPrefix a = new  LongestCommonPrefix();
		assertEquals(expected, a.longestCommonPrefix(strs));
	}

	@Test
	public void test3() {
		String[] strs = {"adc123","abc678","abc444"};
		String expected = "a";
		LongestCommonPrefix a = new  LongestCommonPrefix();
		assertEquals(expected, a.longestCommonPrefix(strs));
	}
	
	@Test
	public void test4() {
		String[] strs = {};
		String expected = "";
		LongestCommonPrefix a = new  LongestCommonPrefix();
		assertEquals(expected, a.longestCommonPrefix(strs));
	}

	@Test
	public void test5() {
		String[] strs = {null,""," "};
		String expected = "";
		LongestCommonPrefix a = new  LongestCommonPrefix();
		assertEquals(expected, a.longestCommonPrefix(strs));
	}
}
