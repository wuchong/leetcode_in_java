import static org.junit.Assert.*;

import org.junit.Test;


public class RomantoIntegerTest {

	@Test
	public void test() {
		String s = "MCDXXXVII";
		RomantoInteger a = new RomantoInteger();
		assertEquals(1437, a.romanToInt(s));
	}

	@Test
	public void test2() {
		String s = "MMMCCCXXXIII";
		RomantoInteger a = new RomantoInteger();
		assertEquals(3333, a.romanToInt(s));
	}
	
	@Test
	public void test3() {
		String s = "CXCIX";
		RomantoInteger a = new RomantoInteger();
		assertEquals(199, a.romanToInt(s));
	}
	
	@Test
	public void test4() {
		String s = "XVIII";
		RomantoInteger a = new RomantoInteger();
		assertEquals(18, a.romanToInt(s));
	}
}
