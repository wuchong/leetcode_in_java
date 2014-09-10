import static org.junit.Assert.*;

import org.junit.Test;


public class MaximumSubarrayTest {

	@Test
	public void test() {
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray a = new MaximumSubarray();
		assertEquals(6, a.maxSubArray(A));
	}

	@Test
	public void test2() {
		int[] A = {-2};
		MaximumSubarray a = new MaximumSubarray();
		assertEquals(-2, a.maxSubArray(A));
	}
	
	@Test
	public void test3() {
		int[] A = {-2,1};
		MaximumSubarray a = new MaximumSubarray();
		assertEquals(1, a.maxSubArray(A));
	}
}
