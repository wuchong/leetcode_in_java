import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Given a binary tree, check whether it is a mirror of itself 
 * (ie, symmetric around its center).
 * 
 * For example, this binary tree is symmetric:
 * 
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following is not:
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * answer: µ›πÈ
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
    	if(root == null) return true;
    	return isSymmetric(root.left,root.right);
    }
    
    private boolean isSymmetric(TreeNode left,TreeNode right){
    	if(left == null && right == null) return true;
    	if(left == null || right == null) return false;	//±ﬂΩÁ≈–∂œ
    	return (left.val == right.val) &&
    			isSymmetric(left.left,right.right) &&
    			isSymmetric(left.right,right.left);
    }

}
