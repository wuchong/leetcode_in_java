import static org.junit.Assert.*;

import org.junit.Test;


public class SearchinRotatedSortedArrayTest {

	@Test
	public void test() {
		int[] A = {1,2};
		int target = 1; 
		SearchinRotatedSortedArray a = new SearchinRotatedSortedArray();
		assertEquals(0, a.search(A, target));
	}
	
	@Test
	public void test2() {
		int[] A = {1,2};
		int target = 2; 
		SearchinRotatedSortedArray a = new SearchinRotatedSortedArray();
		assertEquals(1, a.search(A, target));
	}

	@Test
	public void test3() {
		int[] A = {4,5,6,7,0,1,2};
		int target = 1; 
		SearchinRotatedSortedArray a = new SearchinRotatedSortedArray();
		assertEquals(5, a.search(A, target));
	}
	
	@Test
	public void test4() {
		int[] A = {4,5,6,7,0,1,2};
		int target = 6; 
		SearchinRotatedSortedArray a = new SearchinRotatedSortedArray();
		assertEquals(2, a.search(A, target));
	}
	
	@Test
	public void test5() {
		int[] A = {4,5,6,7,0,1,2};
		int target = 7; 
		SearchinRotatedSortedArray a = new SearchinRotatedSortedArray();
		assertEquals(3, a.search(A, target));
	}
	
	@Test
	public void test6() {
		int[] A = {4,5,6,7,0,1,2};
		int target = 0; 
		SearchinRotatedSortedArray a = new SearchinRotatedSortedArray();
		assertEquals(4, a.search(A, target));
	}
}
