import static org.junit.Assert.*;

import org.junit.Test;


public class MergeSortedArrayTest {

	@Test
	public void test() {
		int[] A = {1,-1};
		int[] B = {2};
		int[] C = {1,2};
		MergeSortedArray a = new MergeSortedArray();
		a.merge(A, 1, B, 1);
		assertArrayEquals(C, A);
	}
	
	@Test
	public void test2() {
		int[] A = {1,4,8,9,-1,-1};
		int[] B = {1,2};
		int[] C = {1,1,2,4,8,9};
		MergeSortedArray a = new MergeSortedArray();
		a.merge(A, 4, B, 2);
		assertArrayEquals(C, A);
	}
	
	@Test
	public void test3() {
		int[] A = {1,4,8,9,-1,-1};
		int[] B = {};
		int[] C = {1,4,8,9,-1,-1};
		MergeSortedArray a = new MergeSortedArray();
		a.merge(A, 4, B, 0);
		assertArrayEquals(C, A);
	}
	
	@Test
	public void test4() {
		int[] A = {2,2,2,2,-1,-1};
		int[] B = {1,4,8,9};
		int[] C = {1,4,8,9,-1,-1};
		MergeSortedArray a = new MergeSortedArray();
		a.merge(A, 0, B, 4);
		assertArrayEquals(C, A);
	}

}
