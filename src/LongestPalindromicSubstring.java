/**
 * Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, 
 * and there exists one unique longest palindromic substring.
 *
 * O(N^2) for time 
 * 
 * An O(N) Solution (Manacher’s Algorithm):
 * see http://leetcode.com/2011/11/longest-palindromic-substring-part-ii.html
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
    	if(s == null) return null;
    	String result = s.substring(0,1);
    	for(int i=1;i<s.length();i++){
    		String p1 = findPalindrome(s,i-1,i);	//偶数个
    		String p2 = findPalindrome(s,i-1,i+1);	//奇数个
    		
    		String longer = p1.length() > p2.length() ? p1 : p2;
    		result = longer.length() > result.length() ? longer : result;
    	}
    	return result;
    }
    
    private String findPalindrome(String s,int start,int end){
    	while(start >= 0 && end <= s.length()-1){
    		if(s.charAt(start) != s.charAt(end))
    			break;
    		start--;
    		end++;
    	}
    	return s.substring(start+1,end);
    }
}
