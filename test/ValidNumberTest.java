import static org.junit.Assert.*;

import org.junit.Test;


public class ValidNumberTest {

	@Test
	public void test1() {
		String s = "0";
		ValidNumber a = new ValidNumber();
		assertEquals(true, a.isNumber(s));
	}
	
	@Test
	public void test2() {
		String s = " 0.1 ";
		ValidNumber a = new ValidNumber();
		assertEquals(true, a.isNumber(s));
	}
	
	@Test
	public void test3() {
		String s = "abc";
		ValidNumber a = new ValidNumber();
		assertEquals(false, a.isNumber(s));
	}
	
	@Test
	public void test4() {
		String s = "1 a";
		ValidNumber a = new ValidNumber();
		assertEquals(false, a.isNumber(s));
	}
	
	@Test
	public void test5() {
		String s = "2e10";
		ValidNumber a = new ValidNumber();
		assertEquals(true, a.isNumber(s));
	}
	
	@Test
	public void test6() {
		String s = "0.";
		ValidNumber a = new ValidNumber();
		assertEquals(true, a.isNumber(s));
	}

	@Test
	public void test7() {
		String s = "53.";
		ValidNumber a = new ValidNumber();
		assertEquals(true, a.isNumber(s));
	}
	
	@Test
	public void test8() {
		String s = ".023";
		ValidNumber a = new ValidNumber();
		assertEquals(true, a.isNumber(s));
	}
	
	@Test
	public void test9() {
		String s = "1.3e50";
		ValidNumber a = new ValidNumber();
		assertEquals(true, a.isNumber(s));
	}
	
	@Test
	public void test10() {
		String s = " _.";
		ValidNumber a = new ValidNumber();
		assertEquals(false, a.isNumber(s));
	}
	
	@Test
	public void test11() {
		String s = "1.3.50";
		ValidNumber a = new ValidNumber();
		assertEquals(false, a.isNumber(s));
	}
}
