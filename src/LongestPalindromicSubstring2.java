/**
 * Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, 
 * and there exists one unique longest palindromic substring.
 *
 * O(N^3) for time 
 * 
 * An O(N) Solution (Manacher¡¯s Algorithm):
 * see http://leetcode.com/2011/11/longest-palindromic-substring-part-ii.html
 */
public class LongestPalindromicSubstring2 {
    public String longestPalindrome(String s) {
    	if(s == null) return null;
        int max_length = 1;
        int offset = 0;
    	for(int i=0;i<s.length();i++){
    		int len = longestPalindromeLength(s,i);
    		if(len > max_length){
    			max_length = len;
    			offset = i;
    		}
    	}
    	return s.substring(offset-max_length+1, offset+1);
    }
    
    private int longestPalindromeLength(String s,int n){
    	for(int i=0;i<n;i++){
    		if(s.charAt(i) == s.charAt(n) && isParlindrome(s,i,n)){
    			return n-i+1;
    		}
    	}
    	return 1;
    }
    
    private boolean isParlindrome(String s,int start,int end){
    	if(s == null || start > end) return false;
    	while(start < end){
    		if(s.charAt(start) != s.charAt(end))
    			return false;
    		start++;
    		end--;
    	}
    	return true;
    }
}
