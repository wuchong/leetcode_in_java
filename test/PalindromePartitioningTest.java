import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;


public class PalindromePartitioningTest {

	@Test
	public void test() {
		String s = "aab";
		PalindromePartitioning a = new PalindromePartitioning();
		List<List<String>> result = a.partition(s);
		String[] path1 = {"aa","b"};
		String[] path2 = {"a","a","b"};
		List<List<String>> expected = new ArrayList<List<String>>();
		expected.add(new ArrayList<String>(Arrays.asList(path1)));
		expected.add(new ArrayList<String>(Arrays.asList(path2)));
		
		AssertUtil.assertListCommonEquals(expected,result);
	}
	
	@Test
	public void test2() {
		String s = "aaa";
		PalindromePartitioning a = new PalindromePartitioning();
		List<List<String>> result = a.partition(s);
		String[] path1 = {"aaa"};
		String[] path2 = {"a","a","a"};
		String[] path3 = {"aa","a"};
		String[] path4 = {"a","aa"};
		List<List<String>> expected = new ArrayList<List<String>>();
		expected.add(new ArrayList<String>(Arrays.asList(path1)));
		expected.add(new ArrayList<String>(Arrays.asList(path2)));
		expected.add(new ArrayList<String>(Arrays.asList(path3)));
		expected.add(new ArrayList<String>(Arrays.asList(path4)));
		
		AssertUtil.assertListCommonEquals(expected,result);
	}

}
