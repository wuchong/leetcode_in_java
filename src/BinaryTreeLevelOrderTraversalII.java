import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        	result.add(0,list);
        }
        return result;
    }
}
