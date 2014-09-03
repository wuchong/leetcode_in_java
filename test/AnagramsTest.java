

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class AnagramsTest {

	@Test
	public void test() {
		 String[] strs = {"and","dan"};
		 Anagrams a = new Anagrams();
		 List<String> result = new ArrayList<String>(Arrays.asList(strs));
		 
		 AssertUtil.assertArrayCommonEquals(result, a.anagrams(strs));
	}
	
	
	@Test
	public void test2() {
		 String[] strs = {"",""};
		 Anagrams a = new Anagrams();
		 List<String> result = new ArrayList<String>(Arrays.asList(strs));
		 
		 AssertUtil.assertArrayCommonEquals(result, a.anagrams(strs));
	}
	
	@Test
	public void test3() {
		 String[] strs = {""};
		 Anagrams a = new Anagrams();
		 List<String> result = new ArrayList<String>();
		 
		 AssertUtil.assertArrayCommonEquals(result, a.anagrams(strs));
	}
	
	@Test
	public void test4() {
		 String[] strs = {"tea","cat","abc","tac","eds","cat","egddfs","eat"};
		 String[] ret = {"tea","cat","cat","tac","eat"};
		 Anagrams a = new Anagrams();
		 List<String> result = new ArrayList<String>(Arrays.asList(ret));
		 
		 AssertUtil.assertArrayCommonEquals(result, a.anagrams(strs));
	}
	


	



}
