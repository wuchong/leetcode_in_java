import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * 
 * Return all possible palindrome partitioning of s.
 * 
 * For example, given s = "aab",
 * Return
 * 
 *   [
 *     ["aa","b"],
 *     ["a","a","b"]
 *   ]
 *   
 * answer: 深搜，长为n的字符串有n-1处可以被分割，遍历每一处，复杂度O(2^n-1)
 */
public class PalindromePartitioning2 {
    public List<List<String>> partition(String s) {
        Stack<String> path = new Stack<>();
        List<List<String>> result = new ArrayList<List<String>>();

        dfs(s, 0, result, path);
        
        return result;
    }
    
    //以s[start]之后开始划分,包括start
	private void dfs(String s, int start, List<List<String>> result,
			Stack<String> path) {
		//将path加入result中
		if(start == s.length()){
			result.add((List<String>)path.clone());
			return;
		}
		for(int i=start;i<s.length();i++){
			if(isPalindrome(s, start, i)){
				path.push(s.substring(start, i+1));
				dfs(s,i+1,result,path);
				path.pop();
			}
		}
	}
    
    private boolean isPalindrome(String s,int start,int end){
    	while(start < end){
    		if(s.charAt(start) != s.charAt(end)){
    			return false;
    		}
    		start++;
    		end--;
    	}
    	return true;
    }
    
}
