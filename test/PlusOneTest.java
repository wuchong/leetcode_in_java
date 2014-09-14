import static org.junit.Assert.*;

import org.junit.Test;


public class PlusOneTest {

	@Test
	public void test() {
		int[] digits = {9,9,9,9};
		int[] expecteds = {1,0,0,0,0};
		PlusOne a = new PlusOne();
		assertArrayEquals(expecteds, a.plusOne(digits));
	}
	
	@Test
	public void test2() {
		int[] digits = {1,2,3,4};
		int[] expecteds = {1,2,3,5};
		PlusOne a = new PlusOne();
		assertArrayEquals(expecteds, a.plusOne(digits));
	}
	
	@Test
	public void test3() {
		int[] digits = {1,2,5,9};
		int[] expecteds = {1,2,6,0};
		PlusOne a = new PlusOne();
		assertArrayEquals(expecteds, a.plusOne(digits));
	}
	
	@Test
	public void test4() {
		int[] digits = {0,9,9};
		int[] expecteds = {1,0,0};
		PlusOne a = new PlusOne();
		assertArrayEquals(expecteds, a.plusOne(digits));
	}

}
