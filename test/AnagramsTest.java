import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;


public class AnagramsTest {

	@Test
	public void test() {
		 String[] strs = {"and","dan"};
		 Anagrams a = new Anagrams();
		 List<String> result = new ArrayList<String>(Arrays.asList(strs));
		 
		 assertArrayEquals(result, a.anagrams(strs));
	}
	
	
	@Test
	public void test2() {
		 String[] strs = {"",""};
		 Anagrams a = new Anagrams();
		 List<String> result = new ArrayList<String>(Arrays.asList(strs));
		 
		 assertArrayEquals(result, a.anagrams(strs));
	}
	
	@Test
	public void test3() {
		 String[] strs = {""};
		 Anagrams a = new Anagrams();
		 List<String> result = new ArrayList<String>();
		 
		 assertArrayEquals(result, a.anagrams(strs));
	}
	
	@Test
	public void test4() {
		 String[] strs = {"tea","cat","abc","tac","eds","cat","egddfs","eat"};
		 String[] ret = {"tea","cat","cat","tac","eat"};
		 Anagrams a = new Anagrams();
		 List<String> result = new ArrayList<String>(Arrays.asList(ret));
		 
		 assertArrayEquals(result, a.anagrams(strs));
	}
	

	private void assertArrayEquals(List<String> result, List<String> anagrams) {
		// TODO Auto-generated method stub
		String ret = arrayToString(result);
		String ana = arrayToString(anagrams);
		assertFalse(errorString(ret,ana),result.size() != anagrams.size());
		
		for(String s : result){
			assertFalse(errorString(ret,ana),!anagrams.contains(s));
		}
		assertTrue(true);
		
	}
	
	private String errorString(Object expected,Object result){
		return "expected:<"+expected+"> but was:<"+result+">";
	}

	private String arrayToString(List<String> list){
		StringBuilder sb = new StringBuilder("[");
		for(String s : list){
			sb.append(s+",");
		}
		sb.append("]");
		return sb.toString();
	}

}
