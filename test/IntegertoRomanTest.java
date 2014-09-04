import static org.junit.Assert.*;

import org.junit.Test;


public class IntegertoRomanTest {

	@Test
	public void test3333() {
		int num = 3333;
		IntegertoRoman a = new IntegertoRoman();
		assertEquals("MMMCCCXXXIII", a.intToRoman(num));
	}
	
	@Test
	public void test1880() {
		int num = 1880;
		IntegertoRoman a = new IntegertoRoman();
		assertEquals("MDCCCLXXX", a.intToRoman(num));
	}
	
	@Test
	public void test1437() {
		int num = 1437;
		IntegertoRoman a = new IntegertoRoman();
		assertEquals("MCDXXXVII", a.intToRoman(num));
	}
	
	@Test
	public void test18() {
		int num = 18;
		IntegertoRoman a = new IntegertoRoman();
		assertEquals("XVIII", a.intToRoman(num));
	}
	
	@Test
	public void test199() {
		int num = 199;
		IntegertoRoman a = new IntegertoRoman();
		assertEquals("CXCIX", a.intToRoman(num));
	}
	
	@Test
	public void test8() {
		int num = 8;
		IntegertoRoman a = new IntegertoRoman();
		assertEquals("VIII", a.intToRoman(num));
	}

}
