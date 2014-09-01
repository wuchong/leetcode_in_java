import static org.junit.Assert.*;

import org.junit.Test;


public class SearchforaRangeTest {

	@Test
	public void test() {
		int[] A = {5, 7, 7, 8, 8, 10};
		SearchforaRange o = new SearchforaRange();
		
		assertArrayEquals(new int[]{3,4}, o.searchRange(A, 8));
	}

	
	@Test
	public void test2() {
		int[] A = {5, 7, 7, 8, 8, 10};
		SearchforaRange o = new SearchforaRange();
		
		assertArrayEquals(new int[]{1,2}, o.searchRange(A, 7));
	}
	
	@Test
	public void test3() {
		int[] A = {5, 6, 7, 9, 10};
		SearchforaRange o = new SearchforaRange();
		
		assertArrayEquals(new int[]{-1,-1}, o.searchRange(A, 8));
	}
	
	@Test
	public void test4() {
		int[] A = {5, 7, 7, 8, 8, 10};
		SearchforaRange o = new SearchforaRange();
		
		assertArrayEquals(new int[]{5,5}, o.searchRange(A, 10));
	}
	
	@Test
	public void test5() {
		int[] A = {2,2};
		SearchforaRange o = new SearchforaRange();
		
		assertArrayEquals(new int[]{-1,-1}, o.searchRange(A, 3));
	}
	
	@Test
	public void test6() {
		int[] A = {2,2};
		SearchforaRange o = new SearchforaRange();
		
		assertArrayEquals(new int[]{-1,-1}, o.searchRange(A, 1));
	}
	
}
