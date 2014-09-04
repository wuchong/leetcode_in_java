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
 * answer: 解法2采用了深搜，长为n的字符串有n-1处可以被分割，遍历每一处，复杂度较高。
 * 其实有很多重复检查回文串的操作，所以可以用动态规划把这些状态保存下来。
 * dp[i][j] 代表[i,j]之间的字符是否是回文
 * dp[i][j] = (s[i] == s[j]) && ( (j-i <= 2) || dp[i+1][j-1] )
 * 时间空间复杂度O(n^2)
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for(int i=len-1;i>=0;i--){
        	for(int j=i;j<len;j++){
        		dp[i][j] = (s.charAt(i) == s.charAt(j)) &&
        				((j-i <= 2) || dp[i+1][j-1] );
        	}
        }
        List<List<String>> result = new ArrayList<List<String>>();
        Stack<String> path = new Stack<>();
        dfs(s, 0, result, path, dp);
        return result;
    }
    
    //以s[start]之后开始划分,包括start
	private void dfs(String s, int start, List<List<String>> result,
			Stack<String> path, boolean[][] dp) {
		//将path加入result中
		if(start == s.length()){
			result.add((List<String>)path.clone());
			return;
		}
		for(int i=start;i<s.length();i++){
			if(dp[start][i]){
				path.push(s.substring(start, i+1));
				dfs(s,i+1,result,path,dp);
				path.pop();
			}
		}
	}
}
