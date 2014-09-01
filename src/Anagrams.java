/**
 * Given an array of strings, return all groups of strings that are anagrams.
 *
 * Note: All inputs will be in lower-case.
 * 
 * answer: 对每个字符串进行字母排序，然后对得到的结果进行hash
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class Anagrams {
	public List<String> anagrams(String[] strs) {
		HashMap<String, List<String>> group = new HashMap<String, List<String>>();
		List<String> result = new ArrayList<String>();
		for(String s : strs){
			char[] chs = s.toCharArray();
			Arrays.sort(chs);
			String key = new String(chs);
			if(group.containsKey(key)){
				group.get(key).add(s);
			}else{
				ArrayList<String> list = new ArrayList<>();
				list.add(s);
				group.put(key, list);
			}
		}
		
		Iterator<String> iter = group.keySet().iterator();
		while(iter.hasNext()){
			List<String> list = group.get(iter.next());
			if(list.size() > 1){
				result.addAll(list);
			}
		}
		return result;
	}

}
