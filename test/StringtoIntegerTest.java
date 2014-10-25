import static org.junit.Assert.*;

import org.junit.Test;


public class StringtoIntegerTest {

	@Test
	public void test() {
		String str = "";
		StringtoInteger a = new StringtoInteger();
		assertEquals(0, a.atoi(str));
	}
	
	@Test
	public void test2() {
		String str = "123";
		StringtoInteger a = new StringtoInteger();
		assertEquals(123, a.atoi(str));
	}
	
	@Test
	public void test3() {
		String str = "2147483648";
		StringtoInteger a = new StringtoInteger();
		assertEquals(2147483647, a.atoi(str));
	}
	
	@Test
	public void test4() {
		String str = "-2147483748";
		StringtoInteger a = new StringtoInteger();
		assertEquals(-2147483648, a.atoi(str));
	}
	
	@Test
	public void test5() {
		String str = "123abc";
		StringtoInteger a = new StringtoInteger();
		assertEquals(123, a.atoi(str));
	}
	
	@Test
	public void test6() {
		String str = " ";
		StringtoInteger a = new StringtoInteger();
		assertEquals(0, a.atoi(str));
	}
	
	@Test
	public void test7() {
		String str = " -a";
		StringtoInteger a = new StringtoInteger();
		assertEquals(0, a.atoi(str));
	}
	
	@Test
	public void test8() {
		String str = " -010";
		StringtoInteger a = new StringtoInteger();
		assertEquals(-10, a.atoi(str));
	}
	
	@Test
	public void test9() {
		String str = " 010";
		StringtoInteger a = new StringtoInteger();
		assertEquals(10, a.atoi(str));
	}
	
	@Test
	public void test10() {
		String str = " -";
		StringtoInteger a = new StringtoInteger();
		assertEquals(0, a.atoi(str));
	}
	
	@Test
	public void test11() {
		String str = "  -0012a42";
		StringtoInteger a = new StringtoInteger();
		assertEquals(-12, a.atoi(str));
	}
	
	@Test
	public void test12() {
		String str = "  321";
		StringtoInteger a = new StringtoInteger();
		assertEquals(321, a.atoi(str));
	}
}
