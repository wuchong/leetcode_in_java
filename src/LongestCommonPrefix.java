/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * answer: 数组中每个字符串从位置0开始匹配
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) return "";
        int i = 0;
        while(isCommon(strs,i)){
        	i++;
        }
        if(i == 0) 
        	return "";
        else
        	return strs[0].substring(0,i);
    }
    
    private boolean isCommon(String[] strs,int i){
    	if(strs[0] == null || i >= strs[0].length()) return false;
    	char ch = strs[0].charAt(i);
    	for(String s : strs){
    		if(strs[0] == null ||  i >= s.length() || s.charAt(i) != ch){
    			return false;
    		}
    	}
    	return true;
    }
}
