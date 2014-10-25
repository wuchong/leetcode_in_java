import static org.junit.Assert.*;

import org.junit.Test;


public class CountandSayTest {

	@Test
	public void test() {
		int n = 0;
		CountandSay a = new CountandSay();
		assertEquals(null, a.countAndSay(n));
	}
	@Test
	public void test1() {
		int n = 1;
		CountandSay a = new CountandSay();
		assertEquals("1", a.countAndSay(n));
	}
	
	@Test
	public void test2() {
		int n = 2;
		CountandSay a = new CountandSay();
		assertEquals("11", a.countAndSay(n));
	}
	
	@Test
	public void test3() {
		int n = 3;
		CountandSay a = new CountandSay();
		assertEquals("21", a.countAndSay(n));
	}
	
	@Test
	public void test4() {
		int n = 4;
		CountandSay a = new CountandSay();
		assertEquals("1211", a.countAndSay(n));
	}

	@Test
	public void test5() {
		int n = 5;
		CountandSay a = new CountandSay();
		assertEquals("111221", a.countAndSay(n));
	}
	
	@Test
	public void test6() {
		int n = 6;
		CountandSay a = new CountandSay();
		assertEquals("312211", a.countAndSay(n));
	}
	
	@Test
	public void test7() {
		int n = 7;
		CountandSay a = new CountandSay();
		assertEquals("13112221", a.countAndSay(n));
	}
}
