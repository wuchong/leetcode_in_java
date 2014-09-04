import static org.junit.Assert.*;

import org.junit.Test;


public class ValidParenthesesTest {

	@Test
	public void test() {
		String s = "()";
		ValidParentheses a = new ValidParentheses();
		assertEquals(true, a.isValid(s));
	}

	@Test
	public void test2() {
		String s = "()[]{}";
		ValidParentheses a = new ValidParentheses();
		assertEquals(true, a.isValid(s));
	}

	@Test
	public void test3() {
		String s = "(]";
		ValidParentheses a = new ValidParentheses();
		assertEquals(false, a.isValid(s));
	}
	
	@Test
	public void test4() {
		String s = "([)]";
		ValidParentheses a = new ValidParentheses();
		assertEquals(false, a.isValid(s));
	}
	
	@Test
	public void test5() {
		String s = "]";
		ValidParentheses a = new ValidParentheses();
		assertEquals(false, a.isValid(s));
	}

	@Test
	public void test6() {
		String s = "(";
		ValidParentheses a = new ValidParentheses();
		assertEquals(false, a.isValid(s));
	}
}
