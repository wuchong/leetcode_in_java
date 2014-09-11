/**
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a 
 * binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * answer: Ê÷£¬µİ¹é
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) >= 0;
    }
    
    private int dfs(TreeNode root){
    	if(root == null){
    		return 0;
    	}
    	int left = dfs(root.left);
    	int right = dfs(root.right);
    	if(left == -1 || right == -1 || Math.abs(left - right) > 1){
    		return -1;
    	}
    	return Math.max(left, right)+1;
    }
}
