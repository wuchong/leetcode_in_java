import static org.junit.Assert.*;

import org.junit.Test;


public class SingleNumberIITest {

	@Test
	public void test() {
		int[] A ={1,1,1,2,2,2,3,3,3,5};
		SingleNumberII a = new SingleNumberII();
		assertEquals(5, a.singleNumber(A));
	}

	@Test
	public void test2() {
		int[] A ={1,1,1,2,2,2,3,3,3,4,5,5,5};
		SingleNumberII a = new SingleNumberII();
		assertEquals(4, a.singleNumber(A));
	}

	
	@Test
	public void test3() {
		int[] A ={1,1,1,2,3,3,3};
		SingleNumberII a = new SingleNumberII();
		assertEquals(2, a.singleNumber(A));
	}
	
	@Test
	public void test4() {
		int[] A ={1};
		SingleNumberII a = new SingleNumberII();
		assertEquals(1, a.singleNumber(A));
	}

}
