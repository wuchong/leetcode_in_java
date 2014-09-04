import static org.junit.Assert.*;

import org.junit.Test;


public class LongestValidParenthesesTest {

	@Test
	public void test() {
		String s = "(()";
		LongestValidParentheses a = new LongestValidParentheses();
		assertEquals(2, a.longestValidParentheses(s));
	}
	
	@Test
	public void test2() {
		String s = ")()())";
		LongestValidParentheses a = new LongestValidParentheses();
		assertEquals(4, a.longestValidParentheses(s));
	}
	
	@Test
	public void test3() {
		String s = ")())(";
		LongestValidParentheses a = new LongestValidParentheses();
		assertEquals(2, a.longestValidParentheses(s));
	}

	@Test
	public void test4() {
		String s = ")((";
		LongestValidParentheses a = new LongestValidParentheses();
		assertEquals(0, a.longestValidParentheses(s));
	}
	
	@Test
	public void test5() {
		String s = "()(()";
		LongestValidParentheses a = new LongestValidParentheses();
		assertEquals(2, a.longestValidParentheses(s));
	}
}
