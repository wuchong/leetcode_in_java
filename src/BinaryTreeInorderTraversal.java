import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [1,3,2].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 * answer: 用栈模拟深搜
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return result;
        TreeNode node = root;
        while(!stack.isEmpty() || node != null){
        	if(node != null){
        		stack.push(node);
        		node = node.left;
        	}else{
        		node = stack.pop();
        		result.add(node.val);
        		node = node.right;
        	}
        }
        return result;
    }
}
