import static org.junit.Assert.*;

import org.junit.Test;


public class RemoveDuplicatesfromSortedArrayIITest {

	@Test
	public void test() {
		int[] A = {1,1,1,2,2,3};
		int[] expecteds = {1,1,2,2,3,3};
		RemoveDuplicatesfromSortedArrayII a = new RemoveDuplicatesfromSortedArrayII();
		assertEquals(5, a.removeDuplicates(A));
		assertArrayEquals(expecteds, A);
	}

	
	@Test
	public void test2() {
		int[] A = {1,1};
		int[] expecteds = {1,1};
		RemoveDuplicatesfromSortedArrayII a = new RemoveDuplicatesfromSortedArrayII();
		assertEquals(2, a.removeDuplicates(A));
		assertArrayEquals(expecteds, A);
	}
	
	@Test
	public void test3() {
		int[] A = {};
		int[] expecteds = {};
		RemoveDuplicatesfromSortedArrayII a = new RemoveDuplicatesfromSortedArrayII();
		assertEquals(0, a.removeDuplicates(A));
		assertArrayEquals(expecteds, A);
	}
	
}
