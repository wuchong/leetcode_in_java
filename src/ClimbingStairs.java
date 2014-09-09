/**
 * You are climbing a stair case. 
 * It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 *
 * answer: 动态规划
 * f(n) = f(n-1)+f(n-2)  空间O(1) 时间O(N)
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
    	int pre = 0;
    	int cur = 1;
        for(int i=1; i<=n;i++){
        	int temp = pre+cur;
        	pre = cur;
        	cur = temp;
        }
        return cur;
    }
}
