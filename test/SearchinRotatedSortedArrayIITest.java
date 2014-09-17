import static org.junit.Assert.*;

import org.junit.Test;


public class SearchinRotatedSortedArrayIITest {

	@Test
	public void test() {
		int[] A = {1,2};
		int target = 1; 
		SearchinRotatedSortedArrayII a = new SearchinRotatedSortedArrayII();
		assertEquals(true, a.search(A, target));
	}
	
	@Test
	public void test2() {
		int[] A = {1,2};
		int target = 2; 
		SearchinRotatedSortedArrayII a = new SearchinRotatedSortedArrayII();
		assertEquals(true, a.search(A, target));
	}

	@Test
	public void test3() {
		int[] A = {4,5,6,7,0,1,2};
		int target = 1; 
		SearchinRotatedSortedArrayII a = new SearchinRotatedSortedArrayII();
		assertEquals(true, a.search(A, target));
	}
	
	@Test
	public void test4() {
		int[] A = {1,3,1,1,1};
		int target = 3; 
		SearchinRotatedSortedArrayII a = new SearchinRotatedSortedArrayII();
		assertEquals(true, a.search(A, target));
	}
	
	@Test
	public void test5() {
		int[] A = {1,1,1};
		int target = 2; 
		SearchinRotatedSortedArrayII a = new SearchinRotatedSortedArrayII();
		assertEquals(false, a.search(A, target));
	}
	

}
