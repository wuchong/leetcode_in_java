import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class PascalsTriangleTest {

	@Test
	public void test5() {
		int n = 5;
		List<List<Integer>> expecteds = new ArrayList<List<Integer>>();
		expecteds.add(Arrays.asList(new Integer[]{1}));
		expecteds.add(Arrays.asList(new Integer[]{1,1}));
		expecteds.add(Arrays.asList(new Integer[]{1,2,1}));
		expecteds.add(Arrays.asList(new Integer[]{1,3,3,1}));
		expecteds.add(Arrays.asList(new Integer[]{1,4,6,4,1}));
		
		PascalsTriangle a = new PascalsTriangle();
		assertEquals(expecteds, a.generate(n));
	}
	
	@Test
	public void test2() {
		int n = 2;
		List<List<Integer>> expecteds = new ArrayList<List<Integer>>();
		expecteds.add(Arrays.asList(new Integer[]{1}));
		expecteds.add(Arrays.asList(new Integer[]{1,1}));

		
		PascalsTriangle a = new PascalsTriangle();
		assertEquals(expecteds, a.generate(n));
	}
	
	@Test
	public void test1() {
		int n = 1;
		List<List<Integer>> expecteds = new ArrayList<List<Integer>>();
		expecteds.add(Arrays.asList(new Integer[]{1}));
		
		PascalsTriangle a = new PascalsTriangle();
		assertEquals(expecteds, a.generate(n));
	}

	@Test
	public void test0() {
		int n = 0;
		List<List<Integer>> expecteds = new ArrayList<List<Integer>>();
		
		PascalsTriangle a = new PascalsTriangle();
		assertEquals(expecteds, a.generate(n));
	}
	
}
