import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [3,2,1].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 * answer: 使用栈来模拟递归的过程
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if(root == null) return res;
        s.push(root);
        TreeNode pre = null;
        TreeNode node = null;
		while (!s.isEmpty()) {
			node = s.peek();
			if ((node.left == null && node.right == null)		//如果是叶子节点
					|| (pre != null && (pre == node.left || pre == node.right))) {	//或者之前遍历过的节点是当前节点的孩子节点
				pre = s.pop();
				res.add(pre.val);
			} else {
				if (node.right != null) {
					s.push(node.right);
				}
				if (node.left != null) {
					s.push(node.left);
				}
			}
		}
        return res;
    }
}
