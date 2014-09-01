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
		if(result.size() != anagrams.size() ) assert(false);
		for(String s : result){
			if(!anagrams.contains(s)){
				assert(false);
			}
		}
		assert(true);
		
	}


}
