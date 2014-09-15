/**
 * Given a m x n grid filled with non-negative numbers, 
 * find a path from top left to bottom right which 
 * minimizes the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 * answer: 动态规划  
 * f(i,j) = min{f(i-1,j) , f(i,j-1)} + grid(i,j)
 * 
 * 时间O(n^2) 空间O(n)，可以在grid上直接操作，就不需要额外空间了，但是会破坏grid。
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[] f = new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
        	f[0] += grid[i][0];
        	for(int j=1;j<grid[0].length;j++){
        		if(i == 0){
        			f[j] = f[j-1] + grid[i][j];
        		}else{
            		f[j] = Math.min(f[j],f[j-1]) + grid[i][j];
        		}
        	}
        }
        return f[f.length-1];
    }
}
