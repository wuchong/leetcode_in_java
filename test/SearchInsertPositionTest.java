import static org.junit.Assert.*;

import org.junit.Test;


public class SearchInsertPositionTest {

	@Test
	public void test() {
		int[] A = {1,3,5,6};
		int target = 0;
		SearchInsertPosition a = new SearchInsertPosition();
		assertEquals(0, a.searchInsert(A, target));
	}
	
	@Test
	public void test2() {
		int[] A = {1,3,5,6};
		int target = 7;
		SearchInsertPosition a = new SearchInsertPosition();
		assertEquals(4, a.searchInsert(A, target));
	}
	
	@Test
	public void test3() {
		int[] A = {1,3,5,6};
		int target = 2;
		SearchInsertPosition a = new SearchInsertPosition();
		assertEquals(1, a.searchInsert(A, target));
	}
	
	
	@Test
	public void test4() {
		int[] A = {1,3,5,6};
		int target = 5;
		SearchInsertPosition a = new SearchInsertPosition();
		assertEquals(2, a.searchInsert(A, target));
	}
	
	@Test
	public void test5() {
		int[] A = {1,3,5,6};
		int target = 6;
		SearchInsertPosition a = new SearchInsertPosition();
		assertEquals(3, a.searchInsert(A, target));
	}
	
	@Test
	public void test6() {
		int[] A = {};
		int target = 6;
		SearchInsertPosition a = new SearchInsertPosition();
		assertEquals(0, a.searchInsert(A, target));
	}
}
