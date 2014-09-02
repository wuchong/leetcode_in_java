import static org.junit.Assert.*;

import org.junit.Test;


public class FirstMissingPositiveTest {

	@Test
	public void test() {
		int[] A = {1,2,0};
		FirstMissingPositive a = new FirstMissingPositive();
		assertEquals(3, a.firstMissingPositive(A));
	}
	
	@Test
	public void test2() {
		int[] A = {3,4,-1,1};
		FirstMissingPositive a = new FirstMissingPositive();
		assertEquals(2, a.firstMissingPositive(A));
	}
	
	@Test
	public void test3() {
		int[] A = {-1,-2,9999};
		FirstMissingPositive a = new FirstMissingPositive();
		assertEquals(1, a.firstMissingPositive(A));
	}
	
	@Test
	public void test4() {
		int[] A = {3,4,2,1};
		FirstMissingPositive a = new FirstMissingPositive();
		assertEquals(5, a.firstMissingPositive(A));
	}

}
