/**
 * A robot is located at the top-left corner of a m x n grid 
 * (marked 'Start' in the diagram below).
 * 
 * The robot can only move either down or right at any point in time. 
 * The robot is trying to reach the bottom-right corner of the grid 
 * (marked 'Finish' in the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * Note: m and n will be at most 100.
 *
 * answer: 动态规划
 * f(m,n) = f(m-1,n) + f(m,n-1)   可以用一维数组实现    时间O(mn) 空间O(n)
 */
public class UniquePaths {
	public int uniquePaths(int m, int n) {
		int[] dp = new int[n];
		dp[0] = 1;
		for (int i = 0; i < m; i++){
			for (int j = 1; j < n; j++){
				dp[j] = dp[j-1] + dp[j];
			}
		}
		return dp[n-1];
	}
}
