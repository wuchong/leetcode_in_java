/**
 * Given a binary tree, find the maximum path sum.
 * 
 * The path may start and end at any node in the tree.
 * 
 * For example:
 * Given the below binary tree,
 * 
 *        1
 *       / \
 *      2   3
 * Return 6.
 *
 * answer: dfs 来进行遍历。先算出左右子树的结果L 和R，如果L 大于0，
 * 那么对后续结果是有利的，我们加上L，如果R 大于0，对后续结果也是有利的，继续加上R。
 */
public class BinaryTreeMaximumPathSum {
	private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    
    private int dfs(TreeNode root){
    	if(root == null) return 0;
    	int left = dfs(root.left);
    	int right = dfs(root.right);
    	int sum = root.val;
    	if(left > 0)
    		sum += left;
    	if(right >0)
    		sum += right;
    	max = Math.max(max, sum);
    	return Math.max(left, right) > 0 ? Math.max(left, right)+root.val : root.val;
    }
}
