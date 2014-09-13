import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class PermutationsIITest {

	@Test
	public void test() {
		int[] input = {1,1,2};
		Integer[] s1 = {1,1,2};
		Integer[] s2 = {1,2,1};
		Integer[] s3 = {2,1,1};

		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(s1));
		expected.add(Arrays.asList(s2));
		expected.add(Arrays.asList(s3));
		
		PermutationsII a = new PermutationsII();
		AssertUtil.assertArrayCommonEquals(expected, a.permuteUnique(input));
	}

	@Test
	public void test2() {
		int[] input = {1,1};
		Integer[] s1 = {1,1};


		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(s1));
		
		PermutationsII a = new PermutationsII();
		AssertUtil.assertArrayCommonEquals(expected, a.permuteUnique(input));
	}
	
	@Test
	public void test3() {
		int[] input = {1};
		Integer[] s1 = {1};

		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(s1));
		
		PermutationsII a = new PermutationsII();
		AssertUtil.assertArrayCommonEquals(expected, a.permuteUnique(input));
	}
	
	@Test
	public void test4() {
		int[] input = {1,2,3};
		Integer[] s1 = {1,2,3};
		Integer[] s2 = {1,3,2};
		Integer[] s3 = {2,1,3};
		Integer[] s4 = {2,3,1};
		Integer[] s5 = {3,1,2};
		Integer[] s6 = {3,2,1};
		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(s1));
		expected.add(Arrays.asList(s2));
		expected.add(Arrays.asList(s3));
		expected.add(Arrays.asList(s4));
		expected.add(Arrays.asList(s5));
		expected.add(Arrays.asList(s6));
		
		PermutationsII a = new PermutationsII();
		AssertUtil.assertArrayCommonEquals(expected, a.permuteUnique(input));
	}

	@Test
	public void test5() {
		int[] input = {1,2};
		Integer[] s1 = {1,2};
		Integer[] s2 = {2,1};


		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(s1));
		expected.add(Arrays.asList(s2));
		
		PermutationsII a = new PermutationsII();
		AssertUtil.assertArrayCommonEquals(expected, a.permuteUnique(input));
	}
}
