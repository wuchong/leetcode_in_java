import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class RemoveDuplicatesfromSortedArrayTest {

	@Test
	public void test() {
		int[] A = {};
		RemoveDuplicatesfromSortedArray a = new RemoveDuplicatesfromSortedArray();
		assertEquals(0, a.removeDuplicates(A));
		System.out.println(Arrays.toString(A));
	}
	
	@Test
	public void test2() {
		int[] A = {1,1,2};
		RemoveDuplicatesfromSortedArray a = new RemoveDuplicatesfromSortedArray();
		assertEquals(2, a.removeDuplicates(A));
		System.out.println(Arrays.toString(A));
	}
	
	@Test
	public void test3() {
		int[] A = {1,2,3,3,5};
		RemoveDuplicatesfromSortedArray a = new RemoveDuplicatesfromSortedArray();
		assertEquals(4, a.removeDuplicates(A));
		System.out.println(Arrays.toString(A));
	}
	
	@Test
	public void test4() {
		int[] A = {1};
		RemoveDuplicatesfromSortedArray a = new RemoveDuplicatesfromSortedArray();
		assertEquals(1, a.removeDuplicates(A));
		System.out.println(Arrays.toString(A));
	}
	

}
