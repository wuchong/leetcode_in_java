import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class GrayCodeTest {

	@Test
	public void test() {
		int n = 2;
		Integer[] result = {0,1,3,2};
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(result));
		GrayCode a = new GrayCode();
		assertEquals(expected, a.grayCode(n));
	}
	
	@Test
	public void test2() {
		int n = 1;
		Integer[] result = {0,1};
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(result));
		GrayCode a = new GrayCode();
		assertEquals(expected, a.grayCode(n));
	}
	
	@Test
	public void test3() {
		int n = 0;
		Integer[] result = {1};
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(result));
		GrayCode a = new GrayCode();
		assertEquals(expected, a.grayCode(n));
	}
	


	@Test
	public void test4() {
		int n = 4;
		Integer[] result = {0,1,3,2,6,7,5,4,12,13,15,14,10,11,9,8};
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(result));
		GrayCode a = new GrayCode();
		assertEquals(expected, a.grayCode(n));
	}



}
