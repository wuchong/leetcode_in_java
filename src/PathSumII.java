import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree and a sum, find all root-to-leaf 
 * paths where each path's sum equals the given sum.
 * 
 * For example:
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * return
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 * 
 * answer: 与上题类似，只是不能剪枝了
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Stack<Integer> s = new Stack<Integer>();
    	pathSum(root,sum,s,res);
    	return res;
    }
    
    @SuppressWarnings("unchecked")
	private void pathSum(TreeNode root, int sum,Stack<Integer> s,List<List<Integer>> res) {
    	if(root == null) return;
    	s.push(root.val);
    	if(root.left == null && root.right == null){
    		if(sum == root.val){
    			res.add((List<Integer>)s.clone());
    		}
			s.pop();
    		return;
    	}
    	pathSum(root.left,sum-root.val,s,res);
    	pathSum(root.right,sum-root.val,s,res);
    	s.pop();
    }
}
