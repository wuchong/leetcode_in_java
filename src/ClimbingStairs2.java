/**
 * You are climbing a stair case. 
 * It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 *
 * answer: 动态规划
 * f(n) = f(n-1)+f(n-2)  空间O(N) 时间O(N)
 */
public class ClimbingStairs2 {
    public int climbStairs(int n) {
    	if(n == 0)	return 1;
        int[] f = new int[n+1];
        f[0] = f[1] = 1;
        for(int i=2; i<f.length;i++){
        	f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
