import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class GenerateParenthesesTest {

	@Test
	public void test3() {
		int n = 3;
		String[] strs = {"((()))", "(()())", "(())()", "()(())", "()()()"};
		ArrayList<String> result = new ArrayList<>(Arrays.asList(strs));
		GenerateParentheses a = new GenerateParentheses();
		AssertUtil.assertArrayCommonEquals(result, a.generateParenthesis(n));
	}

	
	@Test
	public void test2() {
		int n = 2;
		String[] strs = {"(())", "()()"};
		ArrayList<String> result = new ArrayList<>(Arrays.asList(strs));
		GenerateParentheses a = new GenerateParentheses();
		AssertUtil.assertArrayCommonEquals(result, a.generateParenthesis(n));
	}
	
	@Test
	public void test1() {
		int n = 1;
		String[] strs = {"()"};
		ArrayList<String> result = new ArrayList<>(Arrays.asList(strs));
		GenerateParentheses a = new GenerateParentheses();
		AssertUtil.assertArrayCommonEquals(result, a.generateParenthesis(n));
	}
	
	
	@Test
	public void test4() {
		int n = 4;
		String[] strs = { "(((())))", "((()()))", "((())())", "((()))()",
				"(()(()))", "(()()())", "(()())()", "(())(())", "(())()()",
				"()((()))", "()(()())", "()(())()", "()()(())", "()()()()" };
		ArrayList<String> result = new ArrayList<>(Arrays.asList(strs));
		GenerateParentheses a = new GenerateParentheses();
		AssertUtil.assertArrayCommonEquals(result, a.generateParenthesis(n));
	}
	
}
