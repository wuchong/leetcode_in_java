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
public class BinaryTreePostorderTraversal2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return result;
        TreeNode node = root;
        TreeNode pre;
        do{
        	while(node != null){	//左边的节点都进栈
        		stack.push(node);
        		node = node.left;
        	}
        	pre = null;
        	while(!stack.isEmpty()){
        		node = stack.peek();
        		//如果右子树访问过了或为空，则访问该节点
        		if(node.right == pre){
        			result.add(stack.pop().val);
        			pre = node;
        		}else{
        			node = node.right;
        			break;	//先处理右子树
        		}
        	}
        }while(!stack.isEmpty());
        return result;
    }
}
