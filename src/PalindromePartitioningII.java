import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * 
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * 
 * For example, given s = "aab",
 * Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 *   
 * answer: f(i)= 区间[i, n-1] 之间最小的cut 数，n 为字符串长度
 * 如果 [i,j] 间是回文，则 f(i) = f(j+1)+1 , 则状态转移方程为
 * f(i) = min{ f(j + 1) + 1 } ;   i <= j < n && dp[i][j]
 */
public class PalindromePartitioningII {
    public int minCut(String s) {
        int len = s.length();
        if(len == 0)	return 0;
        boolean[][] dp = new boolean[len][len];
        int[] f = new int[len+1];
        for(int i=0;i<len+1;i++){
        	f[i] = len - i -1;
        }
        for(int i=len-1;i>=0;i--){
        	for(int j=i;j<len;j++){
        		if((s.charAt(i) == s.charAt(j)) &&
        				((j-i <= 2) || dp[i+1][j-1] )){
            		dp[i][j] = true;
            		f[i] = Math.min(f[i],f[j+1]+1);
        		}        		
        	}
        }
        return f[0];
    }
    
}
