import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 * 
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * answer: 队列的使用
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(root == null) return result;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode node ;
        int count = 1;	//记录每一层的个数
        while(!q.isEmpty()){
        	ArrayList<Integer> list = new ArrayList<>();
        	int temp = count;
        	count = 0;
        	while(temp-- > 0){
            	node = q.poll();
            	list.add(node.val);
            	if(node.left != null){
            		count++;
            		q.offer(node.left);
            	}
            	if(node.right != null){
            		count++;
            		q.offer(node.right);
            	}
        	}
        	result.add(list);
        }
        return result;
    }
}
