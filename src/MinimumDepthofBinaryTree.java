import java.util.LinkedList;

/**
 * Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest 
 * path from the root node down to the nearest leaf node.
 * 
 * answer:
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int depth = 0;
        int count = 1;	//每层的节点数
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
        	depth++;
        	int temp = count;
        	count = 0;
        	while(temp-- > 0){
        		TreeNode node = q.poll();
        		if(node.left == null && node.right == null){
        			return depth;
        		}
        		if(node.left != null){
        			q.offer(node.left);
        			count ++;
        		}
        		if(node.right != null){
        			q.offer(node.right);
        			count ++;
        		}
        		
        	}
        }
        return depth;
    }
}
