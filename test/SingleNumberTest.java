import static org.junit.Assert.*;

import org.junit.Test;


public class SingleNumberTest {

	@Test
	public void test() {
		int[] A = {1,1,2,2,3};
		SingleNumber a = new SingleNumber();
		assertEquals(3, a.singleNumber(A));
	}
	
	
	@Test
	public void test2() {
		int[] A = {1,3,2,2,3,4,1};
		SingleNumber a = new SingleNumber();
		assertEquals(4, a.singleNumber(A));
	}


}
