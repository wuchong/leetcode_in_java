import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseIntegerTest {

	@Test
	public void test() {
		int x = 123;
		ReverseInteger a = new ReverseInteger();
		assertEquals(321, a.reverse(x));
	}
	
	@Test
	public void test2() {
		int x = -123;
		ReverseInteger a = new ReverseInteger();
		assertEquals(-321, a.reverse(x));
	}
	
	@Test
	public void test3() {
		int x = 100;
		ReverseInteger a = new ReverseInteger();
		assertEquals(1, a.reverse(x));
	}
	
	@Test
	public void test4() {
		int x = -100;
		ReverseInteger a = new ReverseInteger();
		assertEquals(-1, a.reverse(x));
	}
	
	@Test
	public void test5() {
		int x = 10;
		ReverseInteger a = new ReverseInteger();
		assertEquals(1, a.reverse(x));
	}
	
}
