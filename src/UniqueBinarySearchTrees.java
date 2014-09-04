/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * 
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * 
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 *
 * answer: 动态规划，左子树的个数乘以右子树的个数，方程：
 * f(i) = sum{ f(k-1)*f(i-k) | k=1~i}
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
    	int[] f = new int[n+1];	
    	f[0] = 1;
        for(int i=1;i<=n;i++){
        	int sum = 0;
        	for(int k=1;k<=i;k++){
        		sum += f[k-1]*f[i-k];
        	}
        	f[i] = sum;
        }
        return f[n];
    }
}
