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
 * answer: π„À—+ªÿŒƒ≈–∂œ
 */
public class SymmetricTree2 {
    public boolean isSymmetric(TreeNode root) {
    	if(root == null) return true;
        ArrayList<String> sym = new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int count = 1;
        while(!q.isEmpty()){
        	int t = count;
        	count = 0;
        	while(t-- > 0){
        		TreeNode node = q.poll();
        		if(node.left != null){
        			sym.add(node.left.val+"");
        			q.offer(node.left);
        			count++;
        		}else{
        			sym.add("#");
        		}
        		if(node.right != null){
        			sym.add(node.right.val+"");
        			q.offer(node.right);
        			count++;
        		}else{
        			sym.add("#");
        		}
        	}
        	if(!isValid(sym)){
        		return false;
        	}else{
        		sym.clear();
        	}
        }
        return true;
    }
    
    private boolean isValid(ArrayList<String> sym){
    	int begin = 0;
    	int end = sym.size()-1;
    	while(begin < end){
    		if(!sym.get(begin).equals(sym.get(end)))
    			return false;
    		begin++;end--;
    	}
    	return true;
    }
}
