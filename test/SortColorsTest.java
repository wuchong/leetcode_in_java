import static org.junit.Assert.*;

import org.junit.Test;


public class SortColorsTest {

	@Test
	public void test() {
		int[] A = {1,0,0,0,2,2,1,2,0};
		int[] result = {0,0,0,0,1,1,2,2,2};
		SortColors a = new SortColors();
		a.sortColors(A);
		assertArrayEquals(result, A);
	}
	
	@Test
	public void test2() {
		int[] A = {2,2,0,0,0};
		int[] result = {0,0,0,2,2};
		SortColors a = new SortColors();
		a.sortColors(A);
		assertArrayEquals(result, A);
	}
	
	@Test
	public void test3() {
		int[] A = {1,1,1};
		int[] result = {1,1,1};
		SortColors a = new SortColors();
		a.sortColors(A);
		assertArrayEquals(result, A);
	}

}
